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

val Iconsax.Outline.ArrowSwap: ImageVector
    get() {
        if (_ArrowSwap != null) {
            return _ArrowSwap!!
        }
        _ArrowSwap = ImageVector.Builder(
            name = "Outline.ArrowSwap",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(9.009f, 21.25f)
                curveTo(8.819f, 21.25f, 8.629f, 21.18f, 8.479f, 21.03f)
                lineTo(3.469f, 16.02f)
                curveTo(3.179f, 15.73f, 3.179f, 15.25f, 3.469f, 14.96f)
                curveTo(3.759f, 14.67f, 4.239f, 14.67f, 4.529f, 14.96f)
                lineTo(9.539f, 19.97f)
                curveTo(9.829f, 20.26f, 9.829f, 20.74f, 9.539f, 21.03f)
                curveTo(9.389f, 21.17f, 9.199f, 21.25f, 9.009f, 21.25f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(9.01f, 21.25f)
                curveTo(8.6f, 21.25f, 8.26f, 20.91f, 8.26f, 20.5f)
                verticalLineTo(3.5f)
                curveTo(8.26f, 3.09f, 8.6f, 2.75f, 9.01f, 2.75f)
                curveTo(9.42f, 2.75f, 9.76f, 3.09f, 9.76f, 3.5f)
                verticalLineTo(20.5f)
                curveTo(9.76f, 20.91f, 9.42f, 21.25f, 9.01f, 21.25f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(20.01f, 9.26f)
                curveTo(19.819f, 9.26f, 19.629f, 9.19f, 19.479f, 9.04f)
                lineTo(14.469f, 4.03f)
                curveTo(14.179f, 3.74f, 14.179f, 3.26f, 14.469f, 2.97f)
                curveTo(14.759f, 2.68f, 15.24f, 2.68f, 15.53f, 2.97f)
                lineTo(20.539f, 7.98f)
                curveTo(20.83f, 8.27f, 20.83f, 8.75f, 20.539f, 9.04f)
                curveTo(20.389f, 9.19f, 20.199f, 9.26f, 20.01f, 9.26f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(14.99f, 21.25f)
                curveTo(14.58f, 21.25f, 14.24f, 20.91f, 14.24f, 20.5f)
                verticalLineTo(3.5f)
                curveTo(14.24f, 3.09f, 14.58f, 2.75f, 14.99f, 2.75f)
                curveTo(15.4f, 2.75f, 15.74f, 3.09f, 15.74f, 3.5f)
                verticalLineTo(20.5f)
                curveTo(15.74f, 20.91f, 15.41f, 21.25f, 14.99f, 21.25f)
                close()
            }
        }.build()

        return _ArrowSwap!!
    }

@Suppress("ObjectPropertyName")
private var _ArrowSwap: ImageVector? = null
