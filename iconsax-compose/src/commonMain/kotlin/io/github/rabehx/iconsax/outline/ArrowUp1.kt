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

val Iconsax.Outline.ArrowUp1: ImageVector
    get() {
        if (_ArrowUp1 != null) {
            return _ArrowUp1!!
        }
        _ArrowUp1 = ImageVector.Builder(
            name = "Outline.ArrowUp1",
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
                moveTo(12f, 16.25f)
                curveTo(11.59f, 16.25f, 11.25f, 15.91f, 11.25f, 15.5f)
                verticalLineTo(9.5f)
                curveTo(11.25f, 9.09f, 11.59f, 8.75f, 12f, 8.75f)
                curveTo(12.41f, 8.75f, 12.75f, 9.09f, 12.75f, 9.5f)
                verticalLineTo(15.5f)
                curveTo(12.75f, 15.91f, 12.41f, 16.25f, 12f, 16.25f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(15f, 12.25f)
                curveTo(14.809f, 12.25f, 14.62f, 12.18f, 14.469f, 12.03f)
                lineTo(12f, 9.56f)
                lineTo(9.529f, 12.03f)
                curveTo(9.239f, 12.32f, 8.759f, 12.32f, 8.469f, 12.03f)
                curveTo(8.179f, 11.74f, 8.179f, 11.26f, 8.469f, 10.97f)
                lineTo(11.469f, 7.97f)
                curveTo(11.759f, 7.68f, 12.24f, 7.68f, 12.53f, 7.97f)
                lineTo(15.53f, 10.97f)
                curveTo(15.819f, 11.26f, 15.819f, 11.74f, 15.53f, 12.03f)
                curveTo(15.38f, 12.18f, 15.189f, 12.25f, 15f, 12.25f)
                close()
            }
        }.build()

        return _ArrowUp1!!
    }

@Suppress("ObjectPropertyName")
private var _ArrowUp1: ImageVector? = null
