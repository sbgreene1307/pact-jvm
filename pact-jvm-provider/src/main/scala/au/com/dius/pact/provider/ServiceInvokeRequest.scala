package au.com.dius.pact.provider

import au.com.dius.pact.model.Request

object ServiceInvokeRequest {
  def apply(url: String, request: Request):Request = {
    val r = request.copy
    r.setPath(s"$url${request.getPath}")
    r
  }
}
