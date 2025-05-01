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

val Iconsax.Outline.Lamp1: ImageVector
    get() {
        if (_Lamp1 != null) {
            return _Lamp1!!
        }
        _Lamp1 = ImageVector.Builder(
            name = "Outline.Lamp1",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(20.779f, 19.34f)
                horizontalLineTo(3.219f)
                curveTo(2.809f, 19.34f, 2.469f, 19f, 2.469f, 18.59f)
                verticalLineTo(13.65f)
                curveTo(2.469f, 8.43f, 6.719f, 4.18f, 11.939f, 4.18f)
                horizontalLineTo(12.059f)
                curveTo(17.279f, 4.18f, 21.529f, 8.43f, 21.529f, 13.65f)
                verticalLineTo(18.59f)
                curveTo(21.529f, 19f, 21.189f, 19.34f, 20.779f, 19.34f)
                close()
                moveTo(3.969f, 17.84f)
                horizontalLineTo(20.029f)
                verticalLineTo(13.65f)
                curveTo(20.029f, 9.25f, 16.449f, 5.68f, 12.059f, 5.68f)
                horizontalLineTo(11.939f)
                curveTo(7.539f, 5.68f, 3.969f, 9.26f, 3.969f, 13.65f)
                verticalLineTo(17.84f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(12f, 5.68f)
                curveTo(11.59f, 5.68f, 11.25f, 5.34f, 11.25f, 4.93f)
                verticalLineTo(2f)
                curveTo(11.25f, 1.59f, 11.59f, 1.25f, 12f, 1.25f)
                curveTo(12.41f, 1.25f, 12.75f, 1.59f, 12.75f, 2f)
                verticalLineTo(4.93f)
                curveTo(12.75f, 5.34f, 12.41f, 5.68f, 12f, 5.68f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(12f, 22.75f)
                curveTo(9.691f, 22.75f, 7.761f, 20.94f, 7.601f, 18.64f)
                curveTo(7.591f, 18.43f, 7.661f, 18.23f, 7.801f, 18.08f)
                curveTo(7.941f, 17.93f, 8.141f, 17.84f, 8.351f, 17.84f)
                horizontalLineTo(15.651f)
                curveTo(15.861f, 17.84f, 16.061f, 17.93f, 16.201f, 18.08f)
                curveTo(16.341f, 18.23f, 16.41f, 18.44f, 16.4f, 18.64f)
                curveTo(16.24f, 20.94f, 14.311f, 22.75f, 12f, 22.75f)
                close()
                moveTo(9.271f, 19.34f)
                curveTo(9.681f, 20.46f, 10.76f, 21.25f, 12f, 21.25f)
                curveTo(13.241f, 21.25f, 14.321f, 20.46f, 14.731f, 19.34f)
                horizontalLineTo(9.271f)
                close()
            }
        }.build()

        return _Lamp1!!
    }

@Suppress("ObjectPropertyName")
private var _Lamp1: ImageVector? = null
