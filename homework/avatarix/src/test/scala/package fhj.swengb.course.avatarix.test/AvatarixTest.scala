package fhj.swengb.course.avatarix.test


import fhj.swengb.{Students, Student, GitHub, Person}
import org.junit.Assert._
import org.junit.Test

/**
  * Created by graf, hasenbichler, koerner on 14.11.15.
  */

class AvatarixTest {

  @Test def isValid(): Unit = {
    assertEquals("jbtastic", Students.jblazevic.githubUsername)
   }

  @Test def correctAvatarUrl(): Unit = {
    assertTrue(1 == 1)
    //assertEquals(irgendwas == anzahlDerStudenten)
  }

  @Test def correctHtmlUrl(): Unit = {
    //assertTrue(Student existiert nur einmal)
  }

  @Test def correctLogin(): Unit = {
    //blabla
  }

  @Test def cornerCase(): Unit = {
    //Was passiert bei ungültigen Studenten
  }
}
