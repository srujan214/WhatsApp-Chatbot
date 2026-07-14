package com.whatspp.whatsapp_chatbot.controller;

import com.whatspp.whatsapp_chatbot.dto.WebhookRequest;
import com.whatspp.whatsapp_chatbot.dto.WebhookResponse;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/webhook")
public class WebhookController {

    private static final Logger logger = LoggerFactory.getLogger(WebhookController.class);

    @PostMapping
    public ResponseEntity<WebhookResponse> handleWebhook(@RequestBody WebhookRequest request) {
        logger.info("Received message from [{}]: {}", request.getSender(), request.getMessage());

        String incoming = request.getMessage() == null ? "" : request.getMessage().trim().toLowerCase();
        String reply;

        switch (incoming) {
            case "hi":
            case "hello":
                reply = "Hello";
                break;
            case "bye":
                reply = "Goodbye";
                break;
            default:
                reply = "Sorry, I didn't understand that.";
        }

        return ResponseEntity.ok(new WebhookResponse(reply));
    }
}