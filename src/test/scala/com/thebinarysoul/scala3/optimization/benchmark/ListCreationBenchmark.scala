package com.thebinarysoul.scala3.optimization.benchmark
import org.scalameter.api.*
import com.thebinarysoul.scala3.optimization.*

import java.beans.beancontext.BeanContextChild

object ListCreationBenchmark extends Bench.OfflineReport {
  private val ranges = for {
    size <- Gen.range("size")(1000000, 10000000, 1000000)
  } yield 0 until size

  measure method "List(a)" in {
    using(ranges) curve("Range") in {
      _.foreach(a => List(a))
    }
  }

  measure method "List.single(a)" in {
    using(ranges) curve("Range") in {
      _.foreach(a => List.single(a))
    }
  }

  measure method "List(a, b)" in {
    using(ranges) curve("Range") in {
      _.foreach(a => List(a, a))
    }
  }

  measure method "List.double(a, b)" in {
    using(ranges) curve("Range") in {
      _.foreach(a => List.double(a, a))
    }
  }

  measure method "List(a, b, c)" in {
    using(ranges) curve("Range") in {
      _.foreach(a => List(a, a, a))
    }
  }

  measure method "List.triple(a, b, c)" in {
    using(ranges) curve("Range") in {
      _.foreach(a => List.triple(a, a, a))
    }
  }
}
