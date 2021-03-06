 
# 2주차 숫자와 문자 ~ 논리 연산자

-----
## 숫자와 문자

프로그래밍 입문자에게 가장 익숙한 데이터는 숫자와 문자이다. 이들을 어떻게 표현하고 연산하는지 알아보자.

### 숫자

자바에서 따옴표가 없는 숫자는 숫자로 인식한다.
숫자를 출력하는 예제를 보자.


```JAVA

System.out.println(1+2); // 3 출력

System.out.println(1.5+2.3); // 3.8 출력

```

### 문자와 문자열

자바는 문자(Character)와 문자열(String)을 구분한다. 문자는 한 글자를 의미하고, 문자열은 여러 개의 문자가 결합된 것이다. 문자는 '(작은 따옴표), 문자열은 "(큰 따옴표)로 감싸야 한다.


```JAVA

System.out.println('자'); // 자 출력

System.out.println("자바"); // 자바 출력

System.out.println('자바'); // 문자열을 '로 감싸면 오류 발생

```

### 이스케이프

문자열 안에 큰 따옴표를 넣고 싶은 경우 다음과 같이 작성한다.

```JAVA

System.out.println("\"Java\" is hard."); // "Java" is hard. 출력

```

### 줄 바꿈

여러 줄을 표시하고 싶은 경우 다음과 같이 작성한다.

```JAVA

System.out.println("Java\nPython\nC"); 

/* 출력 결
Java
Python
C
*/

```

### 문자 연산

문자와 문자를 더하는 경우 다음과 같이 작성한다.

```JAVA

System.out.println("Java" + "Script"); // JavaScript 출력

```

## 변수

변수(Variable)은 문자나 숫자와 같은 데이터를 담는 컨테이너이다. 자연어에서의 대명사와 비슷한 역할을 한다. 변수를 사용하면 중복을 제거할 수 있고, 가독성을 높여주고, 유지보수를 용이하게 한다.


### 정수와 실수와 문자열

변수에 값을 대입 하는 경우 다음과 같이 작성한다.

```JAVA

int a; // 정수형 변수 선언

a=1;

System.out.println(a+1); // 2 출력


double a = 1.1; // 실수형 변수 선언 

System.out.println(a+1.1); // 2.2 출력


int b = 1.1; // 정수형 변수에 실수 값을 초기화하므로 오류 발생


String str = "Java";

System.out.println(str + " is hard."); // Java is hard. 출력


```

## 주석

주석(comment)은 로직에 대한 설명이나 코드를 비활성화 할 때 사용한다.


주석은 다음과 같이 작성한다.

```JAVA

// 한줄 주석

/*
여러줄 주석
*/


```

## 세미콜론

세미콜론은 문장(statement)의 끝을 의미한다. 자바에서는 문장의 끝에 세미콜론을 사용하지 않으면 컴파일 에러가 발생한다.

```JAVA

aValue = 8933.234; 

int a = 100; double b = 10.1; // 세미콜론을 이용하여 여러 개의 문장을 한 줄에 표현할 수 있다.

```

## 데이터 타입

컴퓨터에서 사용하는 데이터의 크기는 다음과 같다.
| | | |
|-----|---|---|
|8 		bit 	|	(비트)		|1 byte|
|1024 	byte 	|	(바이트)		|1 kilobyte|
|1024 	kilobyte |	(킬로바이트)	|1 megabyte|
|1024 	megabyte |	(메가바이트)	|1 gigabyte|
|1024 	gigabyte |	 (기가바이트)	|1 terabyte|
|1024 	terabyte |	(테라바이트)	|1 petabyte|
|1024 	petabyte |	(페타바이트)	|1 exabyte|
|1024 	exabyte |	(엑사바이트)	|1 zettabyte|


### 정수형

|데이터 타입|메모리의 크기|표현 가능 범위|
|-----|---|---|
|byte|1 byte|-128 ~ 127|
|short|2 byte|-32,768 ~ 32,767|
|int|4 byte|-2,147,483,648~2,147,483,647|
|long|8 byte|-9,223,372,036,854,775,808 ~ 9,223,372,036,854,775,807|

정수형 데이터의 선언은 다음과 같이 작성한다.

```JAVA

int a = 2147;

long b = 2147483647;


```


### 실수형


|데이터 타입|메모리의 크기|표현 가능 범위|
|-----|---|---|
|float|4byte|±(1.40129846432481707e-45 ~ 3.40282346638528860e+38)|
|double|8byte|±(4.94065645841246544e-324d ~ 1.79769313486231570e+308d)|


### 문자

데이터 타입	메모리의 크기		표현 가능 범위
char		2byte			모든 유니코드 문자


## 상수의 데이터 타입

변수는 변하는 값을 의미한다. 그 반대는 변하지 않는 값인 상수이다.

상수를 변수에 대입하는 과정은 다음과 같다.


```JAVA

double a = 2.2; // 실수형 상수의 기본 데이터 타입은 double이다.

float a = 2.2F; // 실수형 상수를 float형으로 명시하기 위해, F 기호를 사용한다.

long a = 2147483648L; // 정수형 상수를 long형으로 명시하기 위해, L 기호를 사용한다.

byte a = 100; // 자바는 byte 타입에 대해서 int 형을 허용한다.

short b = 200; // 자바는 short 타입에 대해서 int 형을 허용한다.

```

## 형 변환

형 변환(Type Conversion)이란 데이터의 타입을 변경하는 것이다.


### 자동 형 변환

자동 형 변환의 원칙은 표현범위가 좁은 데이터 타입에서 넓은 데이터 타입으로의 변환을 허용하는 것이다.

아래는 자동 형 변환이 일어나는 규칙이다.

	byte -> short -> int -> long -> float -> double	
			char


자동 형 변환이 일어나는 예시는 다음과 같다.


```JAVA

double a = 3.0F; // 3.0F가 double 형으로 형 변환

int a = 3; 

float b = 1.0F;

double c = a + b; // 3이 3.0F로 형 변환, 4.0F가 double 형으로 형 변환


```


### 명시적 형 변환

자동 형 변환이 적용되지 않는 경우에는 수동으로 형 변환을 해야 한다. 이를 명시적(Explicit Conversion)이라고 한다.

다음은 명시적 형 변환의 예시이다.


```JAVA

float a = (float)100.0;

int b = (int)100.0F;

```

## 연산자

연산자란 특정한 작업을 하기 위해 사용하는 기호이다.

### 산술 연산자

산술 연산자는 수학적인 계산에 사용되는 연산자이다.

|연산자|의미|
|-----|---|
| + | 더하기 |
| - | 빼기 |
| * | 곱하기 |
| / | 나누기 |
| % | 나머지 |

### 단항 연산자

단항 연산자는 하나의 항을 대상으로 연산이 이루어지는 연산자이다.

|연산자|의미|
|-----|---|
| + | 양수 |
| - | 음수 |
| ++ | 증가 연산자 |
| -- | 감소 연산자 |

다음은 단항 연산자를 사용한 예시이다.

```JAVA

int i = 3;
i++;
System.out.println(i); // 4 출력
++i;
System.out.println(i); // 5 출력
System.out.println(++i); // 6 출력
System.out.println(i++); // 6 출력
System.out.println(i); // 7 출력

```

## 비교 연산자

### Boolean

Boolean은 참과 거짓을 의미하는 데이터 타입으로 bool이라고도 부른다. 참을 의미하는 true와 거짓을 의미하는 false 두 가지의 값을 가지고 있다.

|연산자|의미|
|-----|---|
| == | 좌항과 우항을 비교하여 같으면 true, 다르면 false |
| != | 좌항과 우항을 비교하여 같으면 false, 다르면 true |
| > | 좌항과 우항을 비교하여 좌항이 크면 true, 작으면 false |
| >= | 좌항과 우항을 비교하여 좌항이 크거나 같으면 true, 작으면 false |
| < | 좌항과 우항을 비교하여 우항이 크면 true, 작으면 false |
| <= | 좌항과 우항을 비교하여 우항이 크거나 같으면 true, 작으면 false |

### 문자열 비교

문자열 비교시에는 ==가 아닌 .equals 메소드를 사용한다.

```JAVA

String a = "Hello world";
String b = new String("Hello world");
System.out.println(a == b); // false 출력
System.out.println(a.equals(b)); // true 출력


```

## 조건문

조건문이란 주어진 조건에 따라서 애플리케이션을 다르게 동작하도록 하는 것으로 프로그래밍의 핵심 중의 하나이다.

### if

if 문은 조건문 안의 값이 true 일때 괄호 안의 코드가 실행되고, false 일때 괄호 안의 코드가 실행되지 않는다. else if 문과 else 문을 함께 사용할 수 있다.

```JAVA

if (false) { // false 이므로 실행되지 않음
    System.out.println(1);
} else if (false) { // false 이므로 실행되지 않음
    System.out.println(2);
} else if (true) { // true 이므로 실행
    System.out.println(3);
} else { // 앞의 조건에서 true가 나왔으므로 실행되지 않음
    System.out.println(4);
}


```

### Switch

Switch 문은 사용 빈도는 적지만 조건이 많다면 로직을 명료하게 보여줄 수 있다는 장점이 있다. 조건문 안의 값과 case가 일치하면 해당 코드부터 실행된다.


```JAVA
switch(3){
	case 1:	// 조건과 일치하지 않음
	    System.out.println("one");
	    break;
	case 2:	// 조건과 일치하지 않음
	    System.out.println("two");
	    break;
	case 3:	// 조건과 일치하여 해당 코드부터 실행
	    System.out.println("three");
	    break; // 조건문 탈출
	default:
	    System.out.println("default");
	    break;
}
```

## 논리 연산자

논리 연산자는 Boolean 값과 결합하여 코드를 간결하게 만들 수 있다.

|연산자|의미|
|-----|---|
| &&(and) | 좌항과 우항이 모두 참이면 true, 그렇지 않으면 false |
| \|\|(or) | 좌항과 우항중 하나라도 참이면 true, 그렇지 않으면 false |
| !(not) | 거짓이면 true, 참이면 false |


```JAVA

if (true && false) { // 우항이 거짓이므로 false
    System.out.println(1);
}

if (false || true) { // 우항이 참이므로 true
    System.out.println(2); // 2 출력
}

if (!false) { // 조건이 거짓이므로 true
    System.out.println(3); // 3 출력
}

```




