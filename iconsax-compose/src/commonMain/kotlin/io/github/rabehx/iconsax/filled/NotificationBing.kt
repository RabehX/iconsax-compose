/*
 *
 *  * Copyright (c) 2025, Рабeх Аззам
 *  *
 *  * This file is part of Iconsax Compose.
 *  *
 *  * Iconsax Compose is free software: you can redistribute it and/or modify
 *  * it under the terms of the GNU General Public License as published by
 *  * the Free Software Foundation, either version 3 of the License, or
 *  * (at your option) any later version.
 *  *
 *  * Iconsax Compose is distributed in the hope that it will be useful,
 *  * but WITHOUT ANY WARRANTY; without even the implied warranty of
 *  * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE. See the
 *  * GNU General Public License for more details.
 *  *
 *  * You should have received a copy of the GNU General Public License
 *  * along with Iconsax Compose. If not, see <https://www.gnu.org/licenses/>.
 *
 */

package io.github.rabehx.iconsax.filled


import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import io.github.rabehx.iconsax.Iconsax


val Iconsax.Filled.NotificationBing: ImageVector
    get() {
        if (_NotificationBing != null) {
            return _NotificationBing!!
        }
        _NotificationBing = ImageVector.Builder(
            name = "Filled.NotificationBing",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(20.189f, 14.061f)
                lineTo(19.059f, 12.181f)
                curveTo(18.809f, 11.771f, 18.589f, 10.981f, 18.589f, 10.501f)
                verticalLineTo(8.631f)
                curveTo(18.589f, 5.001f, 15.639f, 2.051f, 12.019f, 2.051f)
                curveTo(8.389f, 2.061f, 5.439f, 5.001f, 5.439f, 8.631f)
                verticalLineTo(10.491f)
                curveTo(5.439f, 10.971f, 5.219f, 11.761f, 4.979f, 12.171f)
                lineTo(3.849f, 14.051f)
                curveTo(3.419f, 14.781f, 3.319f, 15.611f, 3.589f, 16.331f)
                curveTo(3.859f, 17.061f, 4.469f, 17.641f, 5.269f, 17.901f)
                curveTo(6.349f, 18.261f, 7.439f, 18.521f, 8.549f, 18.711f)
                curveTo(8.659f, 18.731f, 8.769f, 18.741f, 8.879f, 18.761f)
                curveTo(9.019f, 18.781f, 9.169f, 18.801f, 9.319f, 18.821f)
                curveTo(9.579f, 18.861f, 9.839f, 18.891f, 10.109f, 18.911f)
                curveTo(10.739f, 18.971f, 11.379f, 19.001f, 12.019f, 19.001f)
                curveTo(12.649f, 19.001f, 13.279f, 18.971f, 13.899f, 18.911f)
                curveTo(14.129f, 18.891f, 14.359f, 18.871f, 14.579f, 18.841f)
                curveTo(14.759f, 18.821f, 14.939f, 18.801f, 15.119f, 18.771f)
                curveTo(15.229f, 18.761f, 15.339f, 18.741f, 15.449f, 18.721f)
                curveTo(16.569f, 18.541f, 17.679f, 18.261f, 18.759f, 17.901f)
                curveTo(19.529f, 17.641f, 20.119f, 17.061f, 20.399f, 16.321f)
                curveTo(20.679f, 15.571f, 20.599f, 14.751f, 20.189f, 14.061f)
                close()
                moveTo(12.749f, 10.001f)
                curveTo(12.749f, 10.421f, 12.409f, 10.761f, 11.989f, 10.761f)
                curveTo(11.569f, 10.761f, 11.229f, 10.421f, 11.229f, 10.001f)
                verticalLineTo(6.901f)
                curveTo(11.229f, 6.481f, 11.569f, 6.141f, 11.989f, 6.141f)
                curveTo(12.409f, 6.141f, 12.749f, 6.481f, 12.749f, 6.901f)
                verticalLineTo(10.001f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(14.83f, 20.01f)
                curveTo(14.41f, 21.17f, 13.3f, 22f, 12f, 22f)
                curveTo(11.21f, 22f, 10.43f, 21.68f, 9.88f, 21.11f)
                curveTo(9.56f, 20.81f, 9.32f, 20.41f, 9.18f, 20f)
                curveTo(9.31f, 20.02f, 9.44f, 20.03f, 9.58f, 20.05f)
                curveTo(9.81f, 20.08f, 10.05f, 20.11f, 10.29f, 20.13f)
                curveTo(10.86f, 20.18f, 11.44f, 20.21f, 12.02f, 20.21f)
                curveTo(12.59f, 20.21f, 13.16f, 20.18f, 13.72f, 20.13f)
                curveTo(13.93f, 20.11f, 14.14f, 20.1f, 14.34f, 20.07f)
                curveTo(14.5f, 20.05f, 14.66f, 20.03f, 14.83f, 20.01f)
                close()
            }
        }.build()

        return _NotificationBing!!
    }

@Suppress("ObjectPropertyName")
private var _NotificationBing: ImageVector? = null
