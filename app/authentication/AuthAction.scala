package authentication

import play.api.Logger
import play.api.mvc.{Result, Request, ActionBuilder}

import scala.concurrent.Future

/**
 * Created by FScoward on 15/08/22.
 */
trait AuthAction extends ActionBuilder[Request] {
  val authMode: AuthMode
  def invokeBlock[A](request: Request[A], block: (Request[A]) => Future[Result]) = {
    Logger.info("--- Call AuthAction")
    
    // TODO write auth action
    
    block(request)
  }
}
abstract sealed class AuthMode
object AuthMode {
  case object Normal extends AuthMode
  case object Authentication extends AuthMode
}

object AuthenticateAuthAction extends AuthAction {
  val authMode = AuthMode.Authentication
}
