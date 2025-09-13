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

val Iconsax.Outline.ArrowDown1: ImageVector
    get() {
        if (_ArrowDown1 != null) {
            return _ArrowDown1!!
        }
        _ArrowDown1 = ImageVector.Builder(
            name = "Outline.ArrowDown1",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(12f, 16.8f)
                curveTo(11.3f, 16.8f, 10.599f, 16.53f, 10.069f, 16f)
                lineTo(3.55f, 9.48f)
                curveTo(3.26f, 9.19f, 3.26f, 8.71f, 3.55f, 8.42f)
                curveTo(3.84f, 8.13f, 4.32f, 8.13f, 4.61f, 8.42f)
                lineTo(11.13f, 14.94f)
                curveTo(11.609f, 15.42f, 12.389f, 15.42f, 12.87f, 14.94f)
                lineTo(19.389f, 8.42f)
                curveTo(19.68f, 8.13f, 20.16f, 8.13f, 20.449f, 8.42f)
                curveTo(20.74f, 8.71f, 20.74f, 9.19f, 20.449f, 9.48f)
                lineTo(13.929f, 16f)
                curveTo(13.399f, 16.53f, 12.7f, 16.8f, 12f, 16.8f)
                close()
            }
        }.build()

        return _ArrowDown1!!
    }

@Suppress("ObjectPropertyName")
private var _ArrowDown1: ImageVector? = null
