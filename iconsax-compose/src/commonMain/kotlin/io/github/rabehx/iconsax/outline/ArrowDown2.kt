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

val Iconsax.Outline.ArrowDown2: ImageVector
    get() {
        if (_ArrowDown2 != null) {
            return _ArrowDown2!!
        }
        _ArrowDown2 = ImageVector.Builder(
            name = "Outline.ArrowDown2",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(12f, 22.75f)
                curveTo(6.07f, 22.75f, 1.25f, 17.93f, 1.25f, 12f)
                curveTo(1.25f, 6.07f, 6.07f, 1.25f, 12f, 1.25f)
                curveTo(17.93f, 1.25f, 22.75f, 6.07f, 22.75f, 12f)
                curveTo(22.75f, 17.93f, 17.93f, 22.75f, 12f, 22.75f)
                close()
                moveTo(12f, 2.75f)
                curveTo(6.9f, 2.75f, 2.75f, 6.9f, 2.75f, 12f)
                curveTo(2.75f, 17.1f, 6.9f, 21.25f, 12f, 21.25f)
                curveTo(17.1f, 21.25f, 21.25f, 17.1f, 21.25f, 12f)
                curveTo(21.25f, 6.9f, 17.1f, 2.75f, 12f, 2.75f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(12f, 15.25f)
                curveTo(11.59f, 15.25f, 11.25f, 14.91f, 11.25f, 14.5f)
                verticalLineTo(8.5f)
                curveTo(11.25f, 8.09f, 11.59f, 7.75f, 12f, 7.75f)
                curveTo(12.41f, 7.75f, 12.75f, 8.09f, 12.75f, 8.5f)
                verticalLineTo(14.5f)
                curveTo(12.75f, 14.91f, 12.41f, 15.25f, 12f, 15.25f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(12f, 16.25f)
                curveTo(11.809f, 16.25f, 11.62f, 16.18f, 11.469f, 16.03f)
                lineTo(8.469f, 13.03f)
                curveTo(8.179f, 12.74f, 8.179f, 12.26f, 8.469f, 11.97f)
                curveTo(8.759f, 11.68f, 9.239f, 11.68f, 9.529f, 11.97f)
                lineTo(12f, 14.44f)
                lineTo(14.469f, 11.97f)
                curveTo(14.759f, 11.68f, 15.24f, 11.68f, 15.53f, 11.97f)
                curveTo(15.819f, 12.26f, 15.819f, 12.74f, 15.53f, 13.03f)
                lineTo(12.53f, 16.03f)
                curveTo(12.38f, 16.18f, 12.189f, 16.25f, 12f, 16.25f)
                close()
            }
        }.build()

        return _ArrowDown2!!
    }

@Suppress("ObjectPropertyName")
private var _ArrowDown2: ImageVector? = null
