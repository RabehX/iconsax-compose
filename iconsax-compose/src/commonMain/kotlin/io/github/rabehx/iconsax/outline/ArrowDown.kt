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

val Iconsax.Outline.ArrowDown: ImageVector
    get() {
        if (_ArrowDown != null) {
            return _ArrowDown!!
        }
        _ArrowDown = ImageVector.Builder(
            name = "Outline.ArrowDown",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(11.999f, 21.25f)
                curveTo(11.809f, 21.25f, 11.619f, 21.18f, 11.469f, 21.03f)
                lineTo(5.399f, 14.96f)
                curveTo(5.109f, 14.67f, 5.109f, 14.19f, 5.399f, 13.9f)
                curveTo(5.689f, 13.61f, 6.169f, 13.61f, 6.459f, 13.9f)
                lineTo(11.999f, 19.44f)
                lineTo(17.539f, 13.9f)
                curveTo(17.829f, 13.61f, 18.309f, 13.61f, 18.599f, 13.9f)
                curveTo(18.889f, 14.19f, 18.889f, 14.67f, 18.599f, 14.96f)
                lineTo(12.529f, 21.03f)
                curveTo(12.379f, 21.18f, 12.189f, 21.25f, 11.999f, 21.25f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(12f, 21.08f)
                curveTo(11.59f, 21.08f, 11.25f, 20.74f, 11.25f, 20.33f)
                verticalLineTo(3.5f)
                curveTo(11.25f, 3.09f, 11.59f, 2.75f, 12f, 2.75f)
                curveTo(12.41f, 2.75f, 12.75f, 3.09f, 12.75f, 3.5f)
                verticalLineTo(20.33f)
                curveTo(12.75f, 20.74f, 12.41f, 21.08f, 12f, 21.08f)
                close()
            }
        }.build()

        return _ArrowDown!!
    }

@Suppress("ObjectPropertyName")
private var _ArrowDown: ImageVector? = null
