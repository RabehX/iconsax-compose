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


val Iconsax.Filled.Slider: ImageVector
    get() {
        if (_Slider != null) {
            return _Slider!!
        }
        _Slider = ImageVector.Builder(
            name = "Filled.Slider",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(18f, 16.012f)
                curveTo(18.55f, 16.012f, 19f, 16.462f, 19f, 17.012f)
                verticalLineTo(18.002f)
                curveTo(19f, 20.202f, 17.5f, 22.002f, 15f, 22.002f)
                horizontalLineTo(9f)
                curveTo(6.5f, 22.002f, 5f, 20.202f, 5f, 18.002f)
                verticalLineTo(17.012f)
                curveTo(5f, 16.462f, 5.45f, 16.012f, 6f, 16.012f)
                horizontalLineTo(18f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(19f, 6f)
                verticalLineTo(13.5f)
                curveTo(19f, 14.05f, 18.55f, 14.5f, 18f, 14.5f)
                horizontalLineTo(6f)
                curveTo(5.45f, 14.5f, 5f, 14.05f, 5f, 13.5f)
                verticalLineTo(6f)
                curveTo(5f, 3.8f, 6.5f, 2f, 9f, 2f)
                horizontalLineTo(15f)
                curveTo(17.5f, 2f, 19f, 3.8f, 19f, 6f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(3f, 20.75f)
                curveTo(2.59f, 20.75f, 2.25f, 20.41f, 2.25f, 20f)
                verticalLineTo(4f)
                curveTo(2.25f, 3.59f, 2.59f, 3.25f, 3f, 3.25f)
                curveTo(3.41f, 3.25f, 3.75f, 3.59f, 3.75f, 4f)
                verticalLineTo(20f)
                curveTo(3.75f, 20.41f, 3.41f, 20.75f, 3f, 20.75f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(21f, 20.75f)
                curveTo(20.59f, 20.75f, 20.25f, 20.41f, 20.25f, 20f)
                verticalLineTo(4f)
                curveTo(20.25f, 3.59f, 20.59f, 3.25f, 21f, 3.25f)
                curveTo(21.41f, 3.25f, 21.75f, 3.59f, 21.75f, 4f)
                verticalLineTo(20f)
                curveTo(21.75f, 20.41f, 21.41f, 20.75f, 21f, 20.75f)
                close()
            }
        }.build()

        return _Slider!!
    }

@Suppress("ObjectPropertyName")
private var _Slider: ImageVector? = null
