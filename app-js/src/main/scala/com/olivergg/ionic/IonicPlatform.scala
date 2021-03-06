package com.olivergg.ionic

import scala.scalajs.js
import com.greencatsoft.angularjs.injectable
import com.greencatsoft.angularjs.core.Promise

@injectable("$ionicPlatform")
@js.native
trait IonicPlatform extends js.Object {
  def ready(callback: js.Function0[_]): Promise[js.Any] = js.native
}
