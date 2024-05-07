package com.example;

import dev.langchain4j.model.chat.ChatLanguageModel;
import dev.langchain4j.model.mistralai.MistralAiChatModel;

public class NativeMistralAI {

    public static void main(String[] args) {

        if (args.length != 1) {
            throw new IllegalArgumentException("Please provide input for the model as an argument");
        }    

        ChatLanguageModel model = MistralAiChatModel.builder()
                .apiKey(System.getenv("MISTRAL_AI_API_KEY"))
                .modelName("mistral-small")
                .build();

        String response = model.generate(args[0]);

        System.out.println(response);
    }
}
