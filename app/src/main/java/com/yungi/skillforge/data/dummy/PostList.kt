package com.yungi.skillforge.data.dummy

import com.yungi.skillforge.data.model.BlogPost
import java.util.UUID

/**
 * Post List dummy data
 */
fun createDummyBlogPosts(): List<BlogPost> {

    val list = mutableListOf<BlogPost>()
    // URL 기반 데이터 (5개)
    list.add(BlogPost(
        id = UUID.randomUUID().toString(),
        title = "Markdown 문법 가이드 및 설명",
        url = "https://songwoody.github.io/markdown_description/",
        thumbnailUrl = "",
        summary = "GitHub 블로그에서 자주 쓰이는 필수 Markdown 문법들을 총정리했습니다.",
        date = "2025-11-20"
    ))
    list.add(BlogPost(
        id = UUID.randomUUID().toString(),
        title = "좋은 시 쓰기 가이드",
        url = "https://songwoody.github.io/poetry_guide/",
        thumbnailUrl = "",
        summary = "시적인 표현력을 높이기 위한 구체적인 방법과 팁을 공유합니다.",
        date = "2025-11-25"
    ))
    list.add(BlogPost(
        id = UUID.randomUUID().toString(),
        title = "Compose 이해: 선언적 UI의 기본",
        url = "https://songwoody.github.io/compose/01_Compose%20%EC%9D%B4%ED%95%B4/",
        thumbnailUrl = "",
        summary = "Jetpack Compose의 핵심 개념인 선언적 프로그래밍 패러다임을 살펴봅니다.",
        date = "2025-12-01"
    ))
    list.add(BlogPost(
        id = UUID.randomUUID().toString(),
        title = "Compose 수명주기 및 상태 관리",
        url = "https://songwoody.github.io/compose/02_Compose%20%EC%88%98%EB%AA%85%EC%A3%BC%EA%B8%B0/",
        thumbnailUrl = "",
        summary = "Composable의 생애 주기(Lifecycle)와 remember, mutableStateOf를 활용한 상태 관리에 대해 깊이 있게 다룹니다.",
        date = "2025-12-05"
    ))
    list.add(BlogPost(
        id = UUID.randomUUID().toString(),
        title = "Compose 부수 효과 (Side Effects) 처리",
        url = "https://songwoody.github.io/compose/03_Compose%20%EB%B6%80%EC%88%98%ED%9A%A8%EA%B3%BC/",
        thumbnailUrl = "",
        summary = "LaunchedEffect, rememberCoroutineScope 등 Compose에서 비동기 작업을 처리하는 방법을 알아봅니다.",
        date = "2025-12-07"
    ))

    // 가상 더미 데이터 (5개)
    list.add(BlogPost(
        id = UUID.randomUUID().toString(),
        title = "Kotlin 코루틴의 Flow를 이용한 비동기 데이터 스트림",
        url = "https://songwoody.github.io/kotlin/flow_deep_dive/",
        thumbnailUrl = "",
        summary = "Cold Stream인 Flow를 사용해서 데이터를 효과적으로 처리하는 방법을 정리했습니다.",
        date = "2025-11-15"
    ))
    list.add(BlogPost(
        id = UUID.randomUUID().toString(),
        title = "Dagger Hilt를 이용한 의존성 주입 기초",
        url = "https://songwoody.github.io/android/hilt_di_basic/",
        thumbnailUrl = "",
        summary = "Android 앱 개발에서 Hilt를 설정하고 사용하는 기본적인 방법을 설명합니다.",
        date = "2025-10-10"
    ))
    list.add(BlogPost(
        id = UUID.randomUUID().toString(),
        title = "알고리즘: 동적 계획법 (Dynamic Programming) 심화",
        url = "https://songwoody.github.io/algorithm/dp_advanced_study/",
        thumbnailUrl = "",
        summary = "대표적인 DP 문제 예시와 최적화 기법을 학습합니다.",
        date = "2025-09-01"
    ))
    list.add(BlogPost(
        id = UUID.randomUUID().toString(),
        title = "클린 아키텍처: Use Case 구현 가이드",
        url = "https://songwoody.github.io/architecture/clean_arch_usecase/",
        thumbnailUrl = "",
        summary = "Domain Layer의 Use Case를 정의하고 구현하는 모범 사례를 제시합니다.",
        date = "2025-08-22"
    ))
    list.add(BlogPost(
        id = UUID.randomUUID().toString(),
        title = "Git Branch 전략: Git Flow vs GitHub Flow",
        url = "https://songwoody.github.io/devops/git_branch_strategy/",
        thumbnailUrl = "",
        summary = "두 가지 주요 브랜치 관리 전략을 비교하고 장단점을 분석합니다.",
        date = "2025-07-30"
    ))

    return list
}