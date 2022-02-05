package com.thebinarysoul.scala3

package object optimization {
  extension (listCompanion: List.type)
    inline def single[T](a: T): List[T] = a :: Nil
    inline def double[T](a: T, b: T): List[T] = a :: single(b)
    inline def triple[T](a: T, b: T, c: T): List[T] = a :: double(b, c)
}
