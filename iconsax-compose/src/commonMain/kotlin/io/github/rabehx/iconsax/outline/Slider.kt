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

val Iconsax.Outline.Slider: ImageVector
    get() {
        if (_Slider != null) {
            return _Slider!!
        }
        _Slider = ImageVector.Builder(
            name = "Outline.Slider",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(15f, 22.75f)
                horizontalLineTo(9f)
                curveTo(6.25f, 22.75f, 4.25f, 20.75f, 4.25f, 18f)
                verticalLineTo(6f)
                curveTo(4.25f, 3.25f, 6.25f, 1.25f, 9f, 1.25f)
                horizontalLineTo(15f)
                curveTo(17.75f, 1.25f, 19.75f, 3.25f, 19.75f, 6f)
                verticalLineTo(18f)
                curveTo(19.75f, 20.75f, 17.75f, 22.75f, 15f, 22.75f)
                close()
                moveTo(9f, 2.75f)
                curveTo(6.75f, 2.75f, 5.75f, 4.38f, 5.75f, 6f)
                verticalLineTo(18f)
                curveTo(5.75f, 19.62f, 6.75f, 21.25f, 9f, 21.25f)
                horizontalLineTo(15f)
                curveTo(17.25f, 21.25f, 18.25f, 19.62f, 18.25f, 18f)
                verticalLineTo(6f)
                curveTo(18.25f, 4.38f, 17.25f, 2.75f, 15f, 2.75f)
                horizontalLineTo(9f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(19f, 16.76f)
                horizontalLineTo(5f)
                curveTo(4.59f, 16.76f, 4.25f, 16.42f, 4.25f, 16.01f)
                curveTo(4.25f, 15.6f, 4.59f, 15.26f, 5f, 15.26f)
                horizontalLineTo(19f)
                curveTo(19.41f, 15.26f, 19.75f, 15.6f, 19.75f, 16.01f)
                curveTo(19.75f, 16.42f, 19.41f, 16.76f, 19f, 16.76f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(2f, 20.75f)
                curveTo(1.59f, 20.75f, 1.25f, 20.41f, 1.25f, 20f)
                verticalLineTo(4f)
                curveTo(1.25f, 3.59f, 1.59f, 3.25f, 2f, 3.25f)
                curveTo(2.41f, 3.25f, 2.75f, 3.59f, 2.75f, 4f)
                verticalLineTo(20f)
                curveTo(2.75f, 20.41f, 2.41f, 20.75f, 2f, 20.75f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(22f, 20.75f)
                curveTo(21.59f, 20.75f, 21.25f, 20.41f, 21.25f, 20f)
                verticalLineTo(4f)
                curveTo(21.25f, 3.59f, 21.59f, 3.25f, 22f, 3.25f)
                curveTo(22.41f, 3.25f, 22.75f, 3.59f, 22.75f, 4f)
                verticalLineTo(20f)
                curveTo(22.75f, 20.41f, 22.41f, 20.75f, 22f, 20.75f)
                close()
            }
        }.build()

        return _Slider!!
    }

@Suppress("ObjectPropertyName")
private var _Slider: ImageVector? = null
