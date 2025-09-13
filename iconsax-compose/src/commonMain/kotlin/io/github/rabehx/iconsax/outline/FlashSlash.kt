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

val Iconsax.Outline.FlashSlash: ImageVector
    get() {
        if (_FlashSlash != null) {
            return _FlashSlash!!
        }
        _FlashSlash = ImageVector.Builder(
            name = "Outline.FlashSlash",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(9.99f, 22.75f)
                curveTo(9.79f, 22.75f, 9.63f, 22.71f, 9.51f, 22.66f)
                curveTo(9.11f, 22.51f, 8.43f, 22.02f, 8.43f, 20.47f)
                verticalLineTo(18.03f)
                curveTo(8.43f, 17.62f, 8.77f, 17.28f, 9.18f, 17.28f)
                curveTo(9.59f, 17.28f, 9.93f, 17.62f, 9.93f, 18.03f)
                verticalLineTo(20.47f)
                curveTo(9.93f, 20.97f, 10.02f, 21.19f, 10.06f, 21.25f)
                curveTo(10.09f, 21.21f, 10.3f, 21.11f, 10.63f, 20.73f)
                lineTo(18.2f, 12.13f)
                curveTo(18.48f, 11.81f, 18.52f, 11.61f, 18.52f, 11.57f)
                curveTo(18.5f, 11.56f, 18.32f, 11.46f, 17.9f, 11.46f)
                horizontalLineTo(16.97f)
                curveTo(16.56f, 11.46f, 16.22f, 11.12f, 16.22f, 10.71f)
                curveTo(16.22f, 10.3f, 16.56f, 9.96f, 16.97f, 9.96f)
                horizontalLineTo(17.9f)
                curveTo(19.24f, 9.96f, 19.72f, 10.59f, 19.89f, 10.96f)
                curveTo(20.06f, 11.34f, 20.21f, 12.11f, 19.33f, 13.12f)
                lineTo(11.76f, 21.72f)
                curveTo(11.05f, 22.54f, 10.43f, 22.75f, 9.99f, 22.75f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(9.181f, 15.22f)
                curveTo(8.771f, 15.22f, 8.431f, 14.88f, 8.431f, 14.47f)
                verticalLineTo(14.04f)
                horizontalLineTo(6.091f)
                curveTo(4.751f, 14.04f, 4.271f, 13.41f, 4.101f, 13.04f)
                curveTo(3.931f, 12.66f, 3.781f, 11.89f, 4.661f, 10.88f)
                lineTo(12.231f, 2.28f)
                curveTo(13.251f, 1.12f, 14.081f, 1.2f, 14.481f, 1.35f)
                curveTo(14.881f, 1.5f, 15.561f, 1.99f, 15.561f, 3.54f)
                verticalLineTo(8.85f)
                curveTo(15.561f, 9.26f, 15.221f, 9.6f, 14.811f, 9.6f)
                curveTo(14.401f, 9.6f, 14.061f, 9.26f, 14.061f, 8.85f)
                verticalLineTo(3.52f)
                curveTo(14.061f, 3.02f, 13.971f, 2.8f, 13.931f, 2.74f)
                curveTo(13.901f, 2.78f, 13.691f, 2.88f, 13.361f, 3.26f)
                lineTo(5.791f, 11.86f)
                curveTo(5.511f, 12.18f, 5.471f, 12.38f, 5.471f, 12.42f)
                curveTo(5.491f, 12.43f, 5.671f, 12.53f, 6.091f, 12.53f)
                horizontalLineTo(9.181f)
                curveTo(9.591f, 12.53f, 9.931f, 12.87f, 9.931f, 13.28f)
                verticalLineTo(14.46f)
                curveTo(9.931f, 14.88f, 9.591f, 15.22f, 9.181f, 15.22f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(1.999f, 22.75f)
                curveTo(1.809f, 22.75f, 1.619f, 22.68f, 1.469f, 22.53f)
                curveTo(1.179f, 22.24f, 1.179f, 21.76f, 1.469f, 21.47f)
                lineTo(21.469f, 1.47f)
                curveTo(21.76f, 1.18f, 22.24f, 1.18f, 22.529f, 1.47f)
                curveTo(22.819f, 1.76f, 22.819f, 2.24f, 22.529f, 2.53f)
                lineTo(2.529f, 22.53f)
                curveTo(2.379f, 22.68f, 2.189f, 22.75f, 1.999f, 22.75f)
                close()
            }
        }.build()

        return _FlashSlash!!
    }

@Suppress("ObjectPropertyName")
private var _FlashSlash: ImageVector? = null
