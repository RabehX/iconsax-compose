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

val Iconsax.Outline.Copy: ImageVector
    get() {
        if (_Copy != null) {
            return _Copy!!
        }
        _Copy = ImageVector.Builder(
            name = "Outline.Copy",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(11.1f, 22.75f)
                horizontalLineTo(6.9f)
                curveTo(2.99f, 22.75f, 1.25f, 21.01f, 1.25f, 17.1f)
                verticalLineTo(12.9f)
                curveTo(1.25f, 8.99f, 2.99f, 7.25f, 6.9f, 7.25f)
                horizontalLineTo(11.1f)
                curveTo(15.01f, 7.25f, 16.75f, 8.99f, 16.75f, 12.9f)
                verticalLineTo(17.1f)
                curveTo(16.75f, 21.01f, 15.01f, 22.75f, 11.1f, 22.75f)
                close()
                moveTo(6.9f, 8.75f)
                curveTo(3.8f, 8.75f, 2.75f, 9.8f, 2.75f, 12.9f)
                verticalLineTo(17.1f)
                curveTo(2.75f, 20.2f, 3.8f, 21.25f, 6.9f, 21.25f)
                horizontalLineTo(11.1f)
                curveTo(14.2f, 21.25f, 15.25f, 20.2f, 15.25f, 17.1f)
                verticalLineTo(12.9f)
                curveTo(15.25f, 9.8f, 14.2f, 8.75f, 11.1f, 8.75f)
                horizontalLineTo(6.9f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(17.1f, 16.75f)
                horizontalLineTo(16f)
                curveTo(15.59f, 16.75f, 15.25f, 16.41f, 15.25f, 16f)
                verticalLineTo(12.9f)
                curveTo(15.25f, 9.8f, 14.2f, 8.75f, 11.1f, 8.75f)
                horizontalLineTo(8f)
                curveTo(7.59f, 8.75f, 7.25f, 8.41f, 7.25f, 8f)
                verticalLineTo(6.9f)
                curveTo(7.25f, 2.99f, 8.99f, 1.25f, 12.9f, 1.25f)
                horizontalLineTo(17.1f)
                curveTo(21.01f, 1.25f, 22.75f, 2.99f, 22.75f, 6.9f)
                verticalLineTo(11.1f)
                curveTo(22.75f, 15.01f, 21.01f, 16.75f, 17.1f, 16.75f)
                close()
                moveTo(16.75f, 15.25f)
                horizontalLineTo(17.1f)
                curveTo(20.2f, 15.25f, 21.25f, 14.2f, 21.25f, 11.1f)
                verticalLineTo(6.9f)
                curveTo(21.25f, 3.8f, 20.2f, 2.75f, 17.1f, 2.75f)
                horizontalLineTo(12.9f)
                curveTo(9.8f, 2.75f, 8.75f, 3.8f, 8.75f, 6.9f)
                verticalLineTo(7.25f)
                horizontalLineTo(11.1f)
                curveTo(15.01f, 7.25f, 16.75f, 8.99f, 16.75f, 12.9f)
                verticalLineTo(15.25f)
                close()
            }
        }.build()

        return _Copy!!
    }

@Suppress("ObjectPropertyName")
private var _Copy: ImageVector? = null
