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

package io.github.rabehx.iconsax.outline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import io.github.rabehx.iconsax.Iconsax

val Iconsax.Outline.Notification: ImageVector
    get() {
        if (_Notification != null) {
            return _Notification!!
        }
        _Notification = ImageVector.Builder(
            name = "Outline.Notification",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(12.02f, 20.53f)
                curveTo(9.69f, 20.53f, 7.36f, 20.16f, 5.15f, 19.42f)
                curveTo(4.31f, 19.13f, 3.67f, 18.54f, 3.39f, 17.77f)
                curveTo(3.1f, 17f, 3.2f, 16.15f, 3.66f, 15.39f)
                lineTo(4.81f, 13.48f)
                curveTo(5.05f, 13.08f, 5.27f, 12.28f, 5.27f, 11.81f)
                verticalLineTo(8.92f)
                curveTo(5.27f, 5.2f, 8.3f, 2.17f, 12.02f, 2.17f)
                curveTo(15.74f, 2.17f, 18.77f, 5.2f, 18.77f, 8.92f)
                verticalLineTo(11.81f)
                curveTo(18.77f, 12.27f, 18.99f, 13.08f, 19.23f, 13.49f)
                lineTo(20.37f, 15.39f)
                curveTo(20.8f, 16.11f, 20.88f, 16.98f, 20.59f, 17.77f)
                curveTo(20.3f, 18.56f, 19.67f, 19.16f, 18.88f, 19.42f)
                curveTo(16.68f, 20.16f, 14.35f, 20.53f, 12.02f, 20.53f)
                close()
                moveTo(12.02f, 3.67f)
                curveTo(9.13f, 3.67f, 6.77f, 6.02f, 6.77f, 8.92f)
                verticalLineTo(11.81f)
                curveTo(6.77f, 12.54f, 6.47f, 13.62f, 6.1f, 14.25f)
                lineTo(4.95f, 16.16f)
                curveTo(4.73f, 16.53f, 4.67f, 16.92f, 4.8f, 17.25f)
                curveTo(4.92f, 17.59f, 5.22f, 17.85f, 5.63f, 17.99f)
                curveTo(9.81f, 19.39f, 14.24f, 19.39f, 18.42f, 17.99f)
                curveTo(18.78f, 17.87f, 19.06f, 17.6f, 19.19f, 17.24f)
                curveTo(19.32f, 16.88f, 19.29f, 16.49f, 19.09f, 16.16f)
                lineTo(17.94f, 14.25f)
                curveTo(17.56f, 13.6f, 17.27f, 12.53f, 17.27f, 11.8f)
                verticalLineTo(8.92f)
                curveTo(17.27f, 6.02f, 14.92f, 3.67f, 12.02f, 3.67f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(13.88f, 3.94f)
                curveTo(13.81f, 3.94f, 13.74f, 3.93f, 13.67f, 3.91f)
                curveTo(13.38f, 3.83f, 13.1f, 3.77f, 12.83f, 3.73f)
                curveTo(11.98f, 3.62f, 11.16f, 3.68f, 10.39f, 3.91f)
                curveTo(10.11f, 4f, 9.81f, 3.91f, 9.62f, 3.7f)
                curveTo(9.43f, 3.49f, 9.37f, 3.19f, 9.48f, 2.92f)
                curveTo(9.89f, 1.87f, 10.89f, 1.18f, 12.03f, 1.18f)
                curveTo(13.17f, 1.18f, 14.17f, 1.86f, 14.58f, 2.92f)
                curveTo(14.68f, 3.19f, 14.63f, 3.49f, 14.44f, 3.7f)
                curveTo(14.29f, 3.86f, 14.08f, 3.94f, 13.88f, 3.94f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(12.019f, 22.81f)
                curveTo(11.03f, 22.81f, 10.069f, 22.41f, 9.37f, 21.71f)
                curveTo(8.67f, 21.01f, 8.27f, 20.05f, 8.27f, 19.06f)
                horizontalLineTo(9.77f)
                curveTo(9.77f, 19.65f, 10.009f, 20.23f, 10.429f, 20.65f)
                curveTo(10.849f, 21.07f, 11.429f, 21.31f, 12.019f, 21.31f)
                curveTo(13.259f, 21.31f, 14.269f, 20.3f, 14.269f, 19.06f)
                horizontalLineTo(15.769f)
                curveTo(15.769f, 21.13f, 14.09f, 22.81f, 12.019f, 22.81f)
                close()
            }
        }.build()

        return _Notification!!
    }

@Suppress("ObjectPropertyName")
private var _Notification: ImageVector? = null
