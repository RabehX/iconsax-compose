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

val Iconsax.Outline.Gameboy: ImageVector
    get() {
        if (_Gameboy != null) {
            return _Gameboy!!
        }
        _Gameboy = ImageVector.Builder(
            name = "Outline.Gameboy",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(16f, 22.75f)
                horizontalLineTo(8f)
                curveTo(4.35f, 22.75f, 2.25f, 20.65f, 2.25f, 17f)
                verticalLineTo(7f)
                curveTo(2.25f, 3.35f, 4.35f, 1.25f, 8f, 1.25f)
                horizontalLineTo(16f)
                curveTo(19.65f, 1.25f, 21.75f, 3.35f, 21.75f, 7f)
                verticalLineTo(17f)
                curveTo(21.75f, 20.65f, 19.65f, 22.75f, 16f, 22.75f)
                close()
                moveTo(8f, 2.75f)
                curveTo(5.14f, 2.75f, 3.75f, 4.14f, 3.75f, 7f)
                verticalLineTo(17f)
                curveTo(3.75f, 19.86f, 5.14f, 21.25f, 8f, 21.25f)
                horizontalLineTo(16f)
                curveTo(18.86f, 21.25f, 20.25f, 19.86f, 20.25f, 17f)
                verticalLineTo(7f)
                curveTo(20.25f, 4.14f, 18.86f, 2.75f, 16f, 2.75f)
                horizontalLineTo(8f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(16.25f, 11.75f)
                horizontalLineTo(7.75f)
                curveTo(6.37f, 11.75f, 5.25f, 10.63f, 5.25f, 9.25f)
                verticalLineTo(6.75f)
                curveTo(5.25f, 5.37f, 6.37f, 4.25f, 7.75f, 4.25f)
                horizontalLineTo(16.25f)
                curveTo(17.63f, 4.25f, 18.75f, 5.37f, 18.75f, 6.75f)
                verticalLineTo(9.25f)
                curveTo(18.75f, 10.63f, 17.63f, 11.75f, 16.25f, 11.75f)
                close()
                moveTo(7.75f, 5.75f)
                curveTo(7.2f, 5.75f, 6.75f, 6.2f, 6.75f, 6.75f)
                verticalLineTo(9.25f)
                curveTo(6.75f, 9.8f, 7.2f, 10.25f, 7.75f, 10.25f)
                horizontalLineTo(16.25f)
                curveTo(16.8f, 10.25f, 17.25f, 9.8f, 17.25f, 9.25f)
                verticalLineTo(6.75f)
                curveTo(17.25f, 6.2f, 16.8f, 5.75f, 16.25f, 5.75f)
                horizontalLineTo(7.75f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(7.999f, 18.33f)
                curveTo(7.809f, 18.33f, 7.619f, 18.26f, 7.469f, 18.11f)
                curveTo(7.179f, 17.82f, 7.179f, 17.34f, 7.469f, 17.05f)
                lineTo(9.769f, 14.75f)
                curveTo(10.059f, 14.46f, 10.539f, 14.46f, 10.829f, 14.75f)
                curveTo(11.119f, 15.04f, 11.119f, 15.52f, 10.829f, 15.81f)
                lineTo(8.529f, 18.11f)
                curveTo(8.379f, 18.26f, 8.189f, 18.33f, 7.999f, 18.33f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(10.33f, 18.36f)
                curveTo(10.14f, 18.36f, 9.95f, 18.29f, 9.8f, 18.14f)
                lineTo(7.5f, 15.84f)
                curveTo(7.21f, 15.55f, 7.21f, 15.07f, 7.5f, 14.78f)
                curveTo(7.79f, 14.49f, 8.27f, 14.49f, 8.56f, 14.78f)
                lineTo(10.86f, 17.08f)
                curveTo(11.15f, 17.37f, 11.15f, 17.85f, 10.86f, 18.14f)
                curveTo(10.71f, 18.29f, 10.52f, 18.36f, 10.33f, 18.36f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(16.51f, 16.33f)
                curveTo(15.96f, 16.33f, 15.5f, 15.88f, 15.5f, 15.33f)
                curveTo(15.5f, 14.78f, 15.94f, 14.33f, 16.49f, 14.33f)
                horizontalLineTo(16.51f)
                curveTo(17.06f, 14.33f, 17.51f, 14.78f, 17.51f, 15.33f)
                curveTo(17.51f, 15.88f, 17.06f, 16.33f, 16.51f, 16.33f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(14.49f, 18.49f)
                curveTo(13.94f, 18.49f, 13.49f, 18.05f, 13.49f, 17.5f)
                verticalLineTo(17.48f)
                curveTo(13.49f, 16.93f, 13.94f, 16.48f, 14.49f, 16.48f)
                curveTo(15.04f, 16.48f, 15.49f, 16.93f, 15.49f, 17.48f)
                curveTo(15.49f, 18.03f, 15.04f, 18.49f, 14.49f, 18.49f)
                close()
            }
        }.build()

        return _Gameboy!!
    }

@Suppress("ObjectPropertyName")
private var _Gameboy: ImageVector? = null
