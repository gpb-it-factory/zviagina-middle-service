# zviagina-middle-service
Middle-сервис для обработки данных, поступающих из телеграм-бота, и взаимодействия с бэкенд-системами для извлечения информации из баз данных

## Как запустить

1. Клонируйте репозиторий:

   ```sh
   git clone https://github.com/gpb-it-factory/zviagina-middle-service
   cd middleware-service
   ./gradlew build
   ./gradlew bootRun

## Взаимодействие между компонентами

### Общая схема взаимодействия

1. **Telegram-бот**:
   - Пользователь отправляет команду `/register`.
   - Бот формирует HTTP POST-запрос с JSON-данными и отправляет его на middleware сервис.

2. **Middleware**:
   - **UserController** принимает запрос, валидирует и передает данные в **RegisterUserUseCase**.
   - **RegisterUserUseCase** вызывает метод **registerUser** в **UserService**.
   - **UserService** использует **BackendClient** для отправки запроса на backend-сервис.

3. **Backend-сервис**:
   - Обрабатывает запрос, взаимодействует с базой данных и возвращает результат middleware сервису.

4. **Middleware**:
   - **BackendClient** получает ответ от backend-сервиса и возвращает его в **UserService**.
   - **UserService** возвращает ответ в **RegisterUserUseCase**.
   - **UserController** возвращает результат Telegram-боту.

5. **Telegram-бот**:
   - Получает ответ от middleware и отправляет сообщение пользователю.

## Эндпоинты

### Регистрация пользователя

URL: /api/user/register

Метод: POST

Тело запроса:
```json
{
"username": "string",
"email": "string"
}
```

Ответ:
```json
{
"status": "string",
"message": "string"
}
```

### Используемые технологии
* Java
* Spring Boot
* Spring Web
* Spring Validation
* RestTemplate
* Gradle
