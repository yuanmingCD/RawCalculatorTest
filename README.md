# RawCalculatorTest
项目中可能会遇到需要相对精确计算内存使用的场景，防止内存被打挂，这里总结了几种常用对象计算工具，并比较性能


### 运行方法
直接运行Main方法

### 运行结果
```java
class com.yuanming.raw.calculator.GraphLayoutRawCalculator
Long size: 24
Integer size: 16
Short size: 16
Float size: 16
Double size: 24
Boolean size: 16
String size: 48
Empty object size: 16
Empty list size: 40
List size: 20976
Object size: 20992


class com.yuanming.raw.calculator.RamUsageEstimatorRawCalculator
Long size: 24
Integer size: 16
Short size: 16
Float size: 16
Double size: 24
Boolean size: 16
String size: 48
Empty object size: 16
Empty list size: 40
List size: 20976
Object size: 20992


class com.yuanming.raw.calculator.ObjectSizeRawCalculator
Long size: 24
Integer size: 16
Short size: 16
Float size: 16
Double size: 24
Boolean size: 16
String size: 48
Empty object size: 16
Empty list size: 40
List size: 20976
Object size: 20992


class com.yuanming.raw.calculator.JavaSizeOfRawCalculator
Long size: 24
Integer size: 16
Short size: 16
Float size: 16
Double size: 24
Boolean size: 16
String size: 48
Empty object size: 16
Empty list size: 40
List size: 20976
Object size: 20992


class com.yuanming.raw.calculator.EhcacheRawCalculator
Long size: 24
Integer size: 16
Short size: 16
Float size: 16
Double size: 24
Boolean size: 16
String size: 48
Empty object size: 16
Empty list size: 40
List size: 20976
Object size: 20992


class com.yuanming.raw.calculator.GraphLayoutRawCalculator
Cost ns per calculate 79707

class com.yuanming.raw.calculator.RamUsageEstimatorRawCalculator
Cost ns per calculate 125171

class com.yuanming.raw.calculator.ObjectSizeRawCalculator
Cost ns per calculate 14213

class com.yuanming.raw.calculator.JavaSizeOfRawCalculator
Cost ns per calculate 125570

class com.yuanming.raw.calculator.EhcacheRawCalculator
Cost ns per calculate 149377
```
