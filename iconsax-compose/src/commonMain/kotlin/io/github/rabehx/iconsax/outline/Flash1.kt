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

val Iconsax.Outline.Flash1: ImageVector
    get() {
        if (_Flash1 != null) {
            return _Flash1!!
        }
        _Flash1 = ImageVector.Builder(
            name = "Outline.Flash1",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(9.991f, 22.75f)
                curveTo(9.791f, 22.75f, 9.631f, 22.71f, 9.511f, 22.66f)
                curveTo(9.111f, 22.51f, 8.431f, 22.02f, 8.431f, 20.47f)
                verticalLineTo(14.02f)
                horizontalLineTo(6.091f)
                curveTo(4.751f, 14.02f, 4.271f, 13.39f, 4.101f, 13.02f)
                curveTo(3.931f, 12.64f, 3.781f, 11.87f, 4.661f, 10.86f)
                lineTo(12.231f, 2.26f)
                curveTo(13.251f, 1.1f, 14.081f, 1.18f, 14.481f, 1.33f)
                curveTo(14.881f, 1.48f, 15.561f, 1.97f, 15.561f, 3.52f)
                verticalLineTo(9.97f)
                horizontalLineTo(17.901f)
                curveTo(19.241f, 9.97f, 19.721f, 10.6f, 19.891f, 10.97f)
                curveTo(20.061f, 11.35f, 20.211f, 12.12f, 19.331f, 13.13f)
                lineTo(11.761f, 21.73f)
                curveTo(11.051f, 22.54f, 10.431f, 22.75f, 9.991f, 22.75f)
                close()
                moveTo(13.931f, 2.74f)
                curveTo(13.901f, 2.78f, 13.691f, 2.88f, 13.361f, 3.26f)
                lineTo(5.791f, 11.86f)
                curveTo(5.511f, 12.18f, 5.471f, 12.38f, 5.471f, 12.42f)
                curveTo(5.491f, 12.43f, 5.671f, 12.53f, 6.091f, 12.53f)
                horizontalLineTo(9.181f)
                curveTo(9.591f, 12.53f, 9.931f, 12.87f, 9.931f, 13.28f)
                verticalLineTo(20.48f)
                curveTo(9.931f, 20.98f, 10.021f, 21.2f, 10.061f, 21.26f)
                curveTo(10.091f, 21.22f, 10.301f, 21.12f, 10.631f, 20.74f)
                lineTo(18.201f, 12.14f)
                curveTo(18.481f, 11.82f, 18.521f, 11.62f, 18.521f, 11.58f)
                curveTo(18.501f, 11.57f, 18.321f, 11.47f, 17.901f, 11.47f)
                horizontalLineTo(14.811f)
                curveTo(14.401f, 11.47f, 14.061f, 11.13f, 14.061f, 10.72f)
                verticalLineTo(3.52f)
                curveTo(14.071f, 3.02f, 13.971f, 2.81f, 13.931f, 2.74f)
                close()
            }
        }.build()

        return _Flash1!!
    }

@Suppress("ObjectPropertyName")
private var _Flash1: ImageVector? = null
