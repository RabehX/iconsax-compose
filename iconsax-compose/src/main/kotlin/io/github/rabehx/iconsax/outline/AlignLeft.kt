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

val Iconsax.Outline.AlignLeft: ImageVector
    get() {
        if (_AlignLeft != null) {
            return _AlignLeft!!
        }
        _AlignLeft = ImageVector.Builder(
            name = "Outline.AlignLeft",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(16.9f, 20f)
                horizontalLineTo(5.1f)
                curveTo(4.69f, 20f, 4.35f, 19.66f, 4.35f, 19.25f)
                curveTo(4.35f, 18.84f, 4.69f, 18.5f, 5.1f, 18.5f)
                horizontalLineTo(16.9f)
                curveTo(17.91f, 18.5f, 18.25f, 18.29f, 18.25f, 17.02f)
                verticalLineTo(15.98f)
                curveTo(18.25f, 14.71f, 17.91f, 14.5f, 16.9f, 14.5f)
                horizontalLineTo(5.1f)
                curveTo(4.69f, 14.5f, 4.35f, 14.16f, 4.35f, 13.75f)
                curveTo(4.35f, 13.34f, 4.69f, 13f, 5.1f, 13f)
                horizontalLineTo(16.9f)
                curveTo(18.82f, 13f, 19.75f, 13.98f, 19.75f, 15.98f)
                verticalLineTo(17.02f)
                curveTo(19.75f, 19.02f, 18.82f, 20f, 16.9f, 20f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(11.9f, 11.5f)
                horizontalLineTo(5.1f)
                curveTo(4.69f, 11.5f, 4.35f, 11.16f, 4.35f, 10.75f)
                curveTo(4.35f, 10.34f, 4.69f, 10f, 5.1f, 10f)
                horizontalLineTo(11.9f)
                curveTo(12.91f, 10f, 13.25f, 9.79f, 13.25f, 8.52f)
                verticalLineTo(7.48f)
                curveTo(13.25f, 6.21f, 12.91f, 6f, 11.9f, 6f)
                horizontalLineTo(5.1f)
                curveTo(4.69f, 6f, 4.35f, 5.66f, 4.35f, 5.25f)
                curveTo(4.35f, 4.84f, 4.69f, 4.5f, 5.1f, 4.5f)
                horizontalLineTo(11.9f)
                curveTo(13.82f, 4.5f, 14.75f, 5.48f, 14.75f, 7.48f)
                verticalLineTo(8.52f)
                curveTo(14.75f, 10.52f, 13.82f, 11.5f, 11.9f, 11.5f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(5f, 22.74f)
                curveTo(4.59f, 22.74f, 4.25f, 22.4f, 4.25f, 21.99f)
                verticalLineTo(1.99f)
                curveTo(4.25f, 1.58f, 4.59f, 1.24f, 5f, 1.24f)
                curveTo(5.41f, 1.24f, 5.75f, 1.58f, 5.75f, 1.99f)
                verticalLineTo(21.99f)
                curveTo(5.75f, 22.4f, 5.41f, 22.74f, 5f, 22.74f)
                close()
            }
        }.build()

        return _AlignLeft!!
    }

@Suppress("ObjectPropertyName")
private var _AlignLeft: ImageVector? = null
