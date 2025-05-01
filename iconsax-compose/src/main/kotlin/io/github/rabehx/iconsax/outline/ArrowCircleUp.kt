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

val Iconsax.Outline.ArrowCircleUp: ImageVector
    get() {
        if (_ArrowCircleUp != null) {
            return _ArrowCircleUp!!
        }
        _ArrowCircleUp = ImageVector.Builder(
            name = "Outline.ArrowCircleUp",
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
                moveTo(15.53f, 14.01f)
                curveTo(15.34f, 14.01f, 15.15f, 13.94f, 15f, 13.79f)
                lineTo(12f, 10.79f)
                lineTo(9f, 13.79f)
                curveTo(8.71f, 14.08f, 8.23f, 14.08f, 7.94f, 13.79f)
                curveTo(7.65f, 13.5f, 7.65f, 13.02f, 7.94f, 12.73f)
                lineTo(11.47f, 9.2f)
                curveTo(11.76f, 8.91f, 12.24f, 8.91f, 12.53f, 9.2f)
                lineTo(16.06f, 12.73f)
                curveTo(16.35f, 13.02f, 16.35f, 13.5f, 16.06f, 13.79f)
                curveTo(15.91f, 13.94f, 15.72f, 14.01f, 15.53f, 14.01f)
                close()
            }
        }.build()

        return _ArrowCircleUp!!
    }

@Suppress("ObjectPropertyName")
private var _ArrowCircleUp: ImageVector? = null
