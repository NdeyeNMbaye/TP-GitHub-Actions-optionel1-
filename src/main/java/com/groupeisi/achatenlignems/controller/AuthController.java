package com.groupeisi.achatenlignems.controller;
import java.util.Optional;
import com.groupeisi.achatenlignems.config.JwtService;
import com.groupeisi.achatenlignems.repository.UserAccountRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Map;

@RestController
@RequestMapping("/api/auth")
@RequiredArgsConstructor
public class AuthController {

    private final JwtService jwtService;
    private final UserAccountRepository userAccountRepository;

    @PostMapping("/login")
    public ResponseEntity<Map<String, String>> login(@RequestBody Map<String, String> request) {
        String email = request.get("email");
        String password = request.get("password");

        return userAccountRepository.findByEmailAndPassword(email, password)
                .map(user -> {
                    String token = jwtService.generateToken(user.getEmail());
                    return ResponseEntity.ok(Map.of("token", token));
                })
                .orElse(ResponseEntity.status(401).body(Map.of("error", "Identifiants invalides")));
    }
}