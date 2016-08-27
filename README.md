# scala-failsafe

Scala Wrapper for https://github.com/jhalterman/failsafe

This is a very thin Scala wrapper around [Failsafe](https://github.com/jhalterman/failsafe).

It is not yet published on Github and / or Maven.  You will have to build it from source.

There's two classes:

https://github.com/wsargent/scala-failsafe/blob/master/src/main/scala/com/lightbend/scalafailsafe/Failsafe.scala

and 

https://github.com/wsargent/scala-failsafe/blob/master/src/main/scala/com/lightbend/scalafailsafe/CircuitBreaker.scala

To use it, import

```
import com.lightbend.scalafailsafe._
```

and then extend the `CircuitBreaker` or `LowPriorityFailsafeImplicits` or `FailsafeBuilder` traits as necessary.
