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


val Iconsax.Filled.Gameboy: ImageVector
    get() {
        if (_Gameboy != null) {
            return _Gameboy!!
        }
        _Gameboy = ImageVector.Builder(
            name = "Filled.Gameboy",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(17f, 2f)
                horizontalLineTo(7f)
                curveTo(4.8f, 2f, 3f, 3.8f, 3f, 6f)
                verticalLineTo(18f)
                curveTo(3f, 20.2f, 4.8f, 22f, 7f, 22f)
                horizontalLineTo(17f)
                curveTo(19.2f, 22f, 21f, 20.2f, 21f, 18f)
                verticalLineTo(6f)
                curveTo(21f, 3.8f, 19.2f, 2f, 17f, 2f)
                close()
                moveTo(10.86f, 18.14f)
                curveTo(10.71f, 18.29f, 10.52f, 18.36f, 10.33f, 18.36f)
                curveTo(10.14f, 18.36f, 9.95f, 18.29f, 9.8f, 18.14f)
                lineTo(9.15f, 17.49f)
                lineTo(8.53f, 18.11f)
                curveTo(8.38f, 18.26f, 8.19f, 18.33f, 8f, 18.33f)
                curveTo(7.81f, 18.33f, 7.62f, 18.26f, 7.47f, 18.11f)
                curveTo(7.18f, 17.82f, 7.18f, 17.34f, 7.47f, 17.05f)
                lineTo(8.09f, 16.43f)
                lineTo(7.5f, 15.84f)
                curveTo(7.21f, 15.55f, 7.21f, 15.07f, 7.5f, 14.78f)
                curveTo(7.79f, 14.49f, 8.27f, 14.49f, 8.56f, 14.78f)
                lineTo(9.15f, 15.37f)
                lineTo(9.77f, 14.75f)
                curveTo(10.06f, 14.46f, 10.54f, 14.46f, 10.83f, 14.75f)
                curveTo(11.12f, 15.04f, 11.12f, 15.52f, 10.83f, 15.81f)
                lineTo(10.21f, 16.43f)
                lineTo(10.86f, 17.08f)
                curveTo(11.15f, 17.37f, 11.15f, 17.85f, 10.86f, 18.14f)
                close()
                moveTo(14.49f, 18.49f)
                curveTo(13.94f, 18.49f, 13.49f, 18.05f, 13.49f, 17.5f)
                verticalLineTo(17.48f)
                curveTo(13.49f, 16.93f, 13.94f, 16.48f, 14.49f, 16.48f)
                curveTo(15.04f, 16.48f, 15.49f, 16.93f, 15.49f, 17.48f)
                curveTo(15.49f, 18.03f, 15.04f, 18.49f, 14.49f, 18.49f)
                close()
                moveTo(16.51f, 16.33f)
                curveTo(15.96f, 16.33f, 15.5f, 15.88f, 15.5f, 15.33f)
                curveTo(15.5f, 14.78f, 15.94f, 14.33f, 16.49f, 14.33f)
                horizontalLineTo(16.51f)
                curveTo(17.06f, 14.33f, 17.51f, 14.78f, 17.51f, 15.33f)
                curveTo(17.51f, 15.88f, 17.06f, 16.33f, 16.51f, 16.33f)
                close()
                moveTo(18f, 9.25f)
                curveTo(18f, 10.21f, 17.21f, 11f, 16.25f, 11f)
                horizontalLineTo(7.75f)
                curveTo(6.79f, 11f, 6f, 10.21f, 6f, 9.25f)
                verticalLineTo(6.75f)
                curveTo(6f, 5.79f, 6.79f, 5f, 7.75f, 5f)
                horizontalLineTo(16.25f)
                curveTo(17.21f, 5f, 18f, 5.79f, 18f, 6.75f)
                verticalLineTo(9.25f)
                close()
            }
        }.build()

        return _Gameboy!!
    }

@Suppress("ObjectPropertyName")
private var _Gameboy: ImageVector? = null
