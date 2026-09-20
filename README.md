# Controle de Veículos V23 — gerar APK sem Android Studio

Este projeto contém a versão V23 do aplicativo e uma automação do GitHub Actions para gerar o APK.

## Como gerar o APK

1. Crie um repositório no GitHub.
2. Envie todos os arquivos e pastas deste projeto para a raiz do repositório.
3. Abra a aba **Actions**.
4. O workflow **Gerar APK do Controle de Veículos V23** será executado automaticamente após o envio para `main`.
5. Quando terminar, abra a execução concluída e baixe o artefato **Controle-Veiculos-V23-APK**.
6. Dentro do ZIP baixado estará o arquivo `app-debug.apk`, que pode ser instalado no Android.

O workflow configura Java e Gradle no próprio GitHub Actions, portanto o computador não precisa ter Android Studio ou Gradle instalados.
