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

val Iconsax.Outline.ArrowSwapHorizontal: ImageVector
    get() {
        if (_ArrowSwapHorizontal != null) {
            return _ArrowSwapHorizontal!!
        }
        _ArrowSwapHorizontal = ImageVector.Builder(
            name = "Outline.ArrowSwapHorizontal",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(15.49f, 20.76f)
                curveTo(15.3f, 20.76f, 15.11f, 20.69f, 14.96f, 20.54f)
                curveTo(14.67f, 20.25f, 14.67f, 19.77f, 14.96f, 19.48f)
                lineTo(19.97f, 14.47f)
                curveTo(20.26f, 14.18f, 20.74f, 14.18f, 21.03f, 14.47f)
                curveTo(21.32f, 14.76f, 21.32f, 15.24f, 21.03f, 15.53f)
                lineTo(16.02f, 20.54f)
                curveTo(15.87f, 20.68f, 15.68f, 20.76f, 15.49f, 20.76f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(20.5f, 15.74f)
                horizontalLineTo(3.5f)
                curveTo(3.09f, 15.74f, 2.75f, 15.4f, 2.75f, 14.99f)
                curveTo(2.75f, 14.58f, 3.09f, 14.24f, 3.5f, 14.24f)
                horizontalLineTo(20.5f)
                curveTo(20.91f, 14.24f, 21.25f, 14.58f, 21.25f, 14.99f)
                curveTo(21.25f, 15.4f, 20.91f, 15.74f, 20.5f, 15.74f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(3.499f, 9.76f)
                curveTo(3.309f, 9.76f, 3.119f, 9.69f, 2.969f, 9.54f)
                curveTo(2.679f, 9.25f, 2.679f, 8.77f, 2.969f, 8.48f)
                lineTo(7.979f, 3.47f)
                curveTo(8.269f, 3.18f, 8.749f, 3.18f, 9.039f, 3.47f)
                curveTo(9.329f, 3.76f, 9.329f, 4.24f, 9.039f, 4.53f)
                lineTo(4.029f, 9.54f)
                curveTo(3.889f, 9.68f, 3.689f, 9.76f, 3.499f, 9.76f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(20.5f, 9.76f)
                horizontalLineTo(3.5f)
                curveTo(3.09f, 9.76f, 2.75f, 9.42f, 2.75f, 9.01f)
                curveTo(2.75f, 8.6f, 3.09f, 8.26f, 3.5f, 8.26f)
                horizontalLineTo(20.5f)
                curveTo(20.91f, 8.26f, 21.25f, 8.6f, 21.25f, 9.01f)
                curveTo(21.25f, 9.42f, 20.91f, 9.76f, 20.5f, 9.76f)
                close()
            }
        }.build()

        return _ArrowSwapHorizontal!!
    }

@Suppress("ObjectPropertyName")
private var _ArrowSwapHorizontal: ImageVector? = null
