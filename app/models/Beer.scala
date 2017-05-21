/*
 * Copyright (C) 2013 47 Degrees, LLC
 * http://47deg.com
 * hello@47deg.com
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package models

import reactivemongo.bson.BSONObjectID
import play.api.libs.json.Json

/**
 * Nothing like a cold beer!
 * @param _id the mongo db id, we provide a string one for simplicity
 * @param title a mandatory title
 * @param description an optional description
 */
case class Beer(
                 _id : String = BSONObjectID.generate.toString(),
                 title : String,
                 description : Option[String] = None
                 )

/**
 * Companion object provides JSON serialization thanks to Play JSON formats
 */
object Beer {
  implicit val beersFormat = Json.format[Beer]
}