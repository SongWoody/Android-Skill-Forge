# Android-Skill-Forge: Now in Android 기반 기술 숙련 프로젝트

## 프로젝트 목표 - Project Goal

본 프로젝트는 구글의 공식 참고 자료인 **'Now in Android'** 프로젝트에서 사용된 최신 안드로이드 기술 스택과 아키텍처 패턴에 완벽하게 익숙해지는 것을 목표로 합니다.  
이를 통해 안정적이고 확장 가능하며 유지보수가 용이한 고품질의 안드로이드 애플리케이션 개발 역량을 확보하고자 합니다.

## 추구 방향 및 핵심 기술

본 프로젝트는 'Now in Android'의 모범 사례를 따르며, 다음 핵심 기술 및 원칙의 깊이 있는 이해와 실제 적용 능력 함양에 중점을 둡니다.

### 1. **핵심 프로그래밍 언어 및 비동기 처리**
* **Kotlin (코틀린):** 모든 코드베이스를 Kotlin으로 작성하여 언어의 고급 기능을 적극적으로 활용합니다.
* **Coroutines & Flow:** 복잡한 비동기 작업 및 데이터 스트림 처리에 **Kotlin Coroutines**와 **StateFlow/SharedFlow**를 적용하여 안정성과 성능을 최적화합니다.

### 2. **모던 UI 및 Jetpack 라이브러리**
* **Jetpack Compose:** 선언형 UI 프레임워크인 Compose를 활용하여 모든 화면을 구축하고, Compose의 상태 관리 방식에 숙련됩니다.
* **Compose Navigation:** Compose 환경에 최적화된 Navigation 컴포넌트를 사용하여 화면 이동 로직을 구현합니다.
* **Hilt (Dependency Injection):** 의존성 주입을 통해 테스트 용이성 및 코드의 모듈화를 확보하고, 앱 전반의 생명 주기를 관리합니다.

### 3. **안정적인 아키텍처 및 설계 원칙**
* **Clean Architecture (클린 아키텍처):** Data, Domain, Presentation 계층을 명확하게 분리하여 각 계층의 관심사를 분리(Separation of Concerns)합니다.
* **Test-Driven Development (TDD) 접근:** 유닛 테스트 (JUnit) 및 UI 테스트 (Compose Testing)를 작성하여 코드의 신뢰성을 높이는 훈련을 병행합니다.

### 4. **데이터 처리 및 저장**
* **Room (Persistence):** 로컬 데이터베이스 처리를 위해 Room을 사용하며, Flow를 연동하여 실시간 데이터 변화를 UI에 반영합니다.
* **Retrofit & Ktor (Networking):** 네트워크 통신 라이브러리를 사용해 RESTful API를 호출하고 응답 데이터를 처리하는 방법을 숙련합니다.

## 💡 프로젝트 진행 원칙

1.  **공식 문서 기반 학습:** 모든 기술 요소는 Google 및 JetBrains의 공식 문서와 권장 가이드라인을 최우선으로 준수하여 구현합니다.
2.  **점진적 개선:** 단순한 기능 구현을 넘어, 코드를 리팩토링하며 성능 및 가독성을 지속적으로 개선합니다.
3.  **코드 리뷰 가능성 고려:** 모든 커밋 메시지와 코드 구조는 다른 개발자가 검토하기 쉽도록 명료하고 일관성 있게 유지합니다.