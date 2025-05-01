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

val Iconsax.Outline.AlignBottom: ImageVector
    get() {
        if (_AlignBottom != null) {
            return _AlignBottom!!
        }
        _AlignBottom = ImageVector.Builder(
            name = "Outline.AlignBottom",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(17.03f, 19.75f)
                horizontalLineTo(15.99f)
                curveTo(13.98f, 19.75f, 13.01f, 18.82f, 13.01f, 16.9f)
                verticalLineTo(5.1f)
                curveTo(13.01f, 4.69f, 13.35f, 4.35f, 13.76f, 4.35f)
                curveTo(14.17f, 4.35f, 14.51f, 4.69f, 14.51f, 5.1f)
                verticalLineTo(16.9f)
                curveTo(14.51f, 17.91f, 14.72f, 18.25f, 15.99f, 18.25f)
                horizontalLineTo(17.03f)
                curveTo(18.3f, 18.25f, 18.51f, 17.91f, 18.51f, 16.9f)
                verticalLineTo(5.1f)
                curveTo(18.51f, 4.69f, 18.85f, 4.35f, 19.26f, 4.35f)
                curveTo(19.67f, 4.35f, 20.01f, 4.69f, 20.01f, 5.1f)
                verticalLineTo(16.9f)
                curveTo(20.01f, 18.82f, 19.04f, 19.75f, 17.03f, 19.75f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(8.53f, 14.75f)
                horizontalLineTo(7.49f)
                curveTo(5.48f, 14.75f, 4.51f, 13.82f, 4.51f, 11.9f)
                verticalLineTo(5.1f)
                curveTo(4.51f, 4.69f, 4.85f, 4.35f, 5.26f, 4.35f)
                curveTo(5.67f, 4.35f, 6.01f, 4.69f, 6.01f, 5.1f)
                verticalLineTo(11.9f)
                curveTo(6.01f, 12.91f, 6.22f, 13.25f, 7.49f, 13.25f)
                horizontalLineTo(8.53f)
                curveTo(9.8f, 13.25f, 10.01f, 12.91f, 10.01f, 11.9f)
                verticalLineTo(5.1f)
                curveTo(10.01f, 4.69f, 10.35f, 4.35f, 10.76f, 4.35f)
                curveTo(11.17f, 4.35f, 11.51f, 4.69f, 11.51f, 5.1f)
                verticalLineTo(11.9f)
                curveTo(11.51f, 13.82f, 10.54f, 14.75f, 8.53f, 14.75f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(22f, 5.75f)
                horizontalLineTo(2f)
                curveTo(1.58f, 5.75f, 1.25f, 5.41f, 1.25f, 5f)
                curveTo(1.25f, 4.59f, 1.58f, 4.25f, 2f, 4.25f)
                horizontalLineTo(22f)
                curveTo(22.41f, 4.25f, 22.75f, 4.59f, 22.75f, 5f)
                curveTo(22.75f, 5.41f, 22.42f, 5.75f, 22f, 5.75f)
                close()
            }
        }.build()

        return _AlignBottom!!
    }

@Suppress("ObjectPropertyName")
private var _AlignBottom: ImageVector? = null
