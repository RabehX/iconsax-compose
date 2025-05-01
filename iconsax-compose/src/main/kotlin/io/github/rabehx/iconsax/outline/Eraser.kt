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

val Iconsax.Outline.Eraser: ImageVector
    get() {
        if (_Eraser != null) {
            return _Eraser!!
        }
        _Eraser = ImageVector.Builder(
            name = "Outline.Eraser",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(15f, 22.75f)
                horizontalLineTo(9f)
                curveTo(3.57f, 22.75f, 1.25f, 20.43f, 1.25f, 15f)
                verticalLineTo(9f)
                curveTo(1.25f, 3.57f, 3.57f, 1.25f, 9f, 1.25f)
                horizontalLineTo(15f)
                curveTo(20.43f, 1.25f, 22.75f, 3.57f, 22.75f, 9f)
                verticalLineTo(15f)
                curveTo(22.75f, 20.43f, 20.43f, 22.75f, 15f, 22.75f)
                close()
                moveTo(9f, 2.75f)
                curveTo(4.39f, 2.75f, 2.75f, 4.39f, 2.75f, 9f)
                verticalLineTo(15f)
                curveTo(2.75f, 19.61f, 4.39f, 21.25f, 9f, 21.25f)
                horizontalLineTo(15f)
                curveTo(19.61f, 21.25f, 21.25f, 19.61f, 21.25f, 15f)
                verticalLineTo(9f)
                curveTo(21.25f, 4.39f, 19.61f, 2.75f, 15f, 2.75f)
                horizontalLineTo(9f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(10.091f, 18.25f)
                curveTo(9.471f, 18.25f, 8.861f, 18.02f, 8.391f, 17.55f)
                lineTo(6.451f, 15.61f)
                curveTo(5.511f, 14.67f, 5.511f, 13.15f, 6.451f, 12.21f)
                lineTo(12.201f, 6.46f)
                curveTo(13.141f, 5.52f, 14.661f, 5.52f, 15.601f, 6.46f)
                lineTo(17.541f, 8.4f)
                curveTo(18.481f, 9.34f, 18.481f, 10.86f, 17.541f, 11.8f)
                lineTo(11.791f, 17.55f)
                curveTo(11.321f, 18.01f, 10.711f, 18.25f, 10.091f, 18.25f)
                close()
                moveTo(7.521f, 14.55f)
                lineTo(9.461f, 16.49f)
                curveTo(9.811f, 16.84f, 10.391f, 16.84f, 10.741f, 16.49f)
                lineTo(16.491f, 10.74f)
                curveTo(16.841f, 10.39f, 16.841f, 9.81f, 16.491f, 9.46f)
                lineTo(14.551f, 7.52f)
                curveTo(14.201f, 7.17f, 13.621f, 7.17f, 13.271f, 7.52f)
                lineTo(7.521f, 13.27f)
                curveTo(7.171f, 13.62f, 7.171f, 14.19f, 7.521f, 14.55f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(13.58f, 15.44f)
                curveTo(13.39f, 15.44f, 13.2f, 15.37f, 13.05f, 15.22f)
                lineTo(8.77f, 10.94f)
                curveTo(8.48f, 10.65f, 8.48f, 10.17f, 8.77f, 9.88f)
                curveTo(9.06f, 9.59f, 9.54f, 9.59f, 9.83f, 9.88f)
                lineTo(14.11f, 14.16f)
                curveTo(14.4f, 14.45f, 14.4f, 14.93f, 14.11f, 15.22f)
                curveTo(13.97f, 15.37f, 13.77f, 15.44f, 13.58f, 15.44f)
                close()
            }
        }.build()

        return _Eraser!!
    }

@Suppress("ObjectPropertyName")
private var _Eraser: ImageVector? = null
