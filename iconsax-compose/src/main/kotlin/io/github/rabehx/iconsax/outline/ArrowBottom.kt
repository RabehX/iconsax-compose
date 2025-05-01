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

val Iconsax.Outline.ArrowBottom: ImageVector
    get() {
        if (_ArrowBottom != null) {
            return _ArrowBottom!!
        }
        _ArrowBottom = ImageVector.Builder(
            name = "Outline.ArrowBottom",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(11.999f, 18.75f)
                curveTo(10.579f, 18.75f, 9.279f, 17.85f, 8.339f, 16.22f)
                lineTo(5.669f, 11.59f)
                curveTo(4.719f, 9.96f, 4.599f, 8.39f, 5.309f, 7.16f)
                curveTo(6.019f, 5.93f, 7.449f, 5.25f, 9.329f, 5.25f)
                horizontalLineTo(14.669f)
                curveTo(16.549f, 5.25f, 17.979f, 5.93f, 18.689f, 7.16f)
                curveTo(19.399f, 8.39f, 19.269f, 9.97f, 18.329f, 11.6f)
                lineTo(15.659f, 16.23f)
                curveTo(14.719f, 17.85f, 13.419f, 18.75f, 11.999f, 18.75f)
                close()
                moveTo(9.329f, 6.75f)
                curveTo(7.999f, 6.75f, 7.039f, 7.16f, 6.609f, 7.91f)
                curveTo(6.169f, 8.66f, 6.299f, 9.7f, 6.959f, 10.84f)
                lineTo(9.629f, 15.47f)
                curveTo(10.289f, 16.62f, 11.129f, 17.25f, 11.989f, 17.25f)
                curveTo(12.849f, 17.25f, 13.689f, 16.62f, 14.349f, 15.47f)
                lineTo(17.019f, 10.84f)
                curveTo(17.679f, 9.69f, 17.809f, 8.65f, 17.379f, 7.9f)
                curveTo(16.949f, 7.15f, 15.979f, 6.74f, 14.659f, 6.74f)
                horizontalLineTo(9.329f)
                verticalLineTo(6.75f)
                close()
            }
        }.build()

        return _ArrowBottom!!
    }

@Suppress("ObjectPropertyName")
private var _ArrowBottom: ImageVector? = null
