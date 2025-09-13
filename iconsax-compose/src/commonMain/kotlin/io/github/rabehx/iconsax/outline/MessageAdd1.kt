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

val Iconsax.Outline.MessageAdd1: ImageVector
    get() {
        if (_MessageAdd1 != null) {
            return _MessageAdd1!!
        }
        _MessageAdd1 = ImageVector.Builder(
            name = "Outline.MessageAdd1",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(16f, 22.75f)
                horizontalLineTo(3f)
                curveTo(2.04f, 22.75f, 1.25f, 21.96f, 1.25f, 21f)
                verticalLineTo(8f)
                curveTo(1.25f, 3.58f, 3.58f, 1.25f, 8f, 1.25f)
                horizontalLineTo(16f)
                curveTo(20.42f, 1.25f, 22.75f, 3.58f, 22.75f, 8f)
                verticalLineTo(16f)
                curveTo(22.75f, 20.42f, 20.42f, 22.75f, 16f, 22.75f)
                close()
                moveTo(8f, 2.75f)
                curveTo(4.42f, 2.75f, 2.75f, 4.42f, 2.75f, 8f)
                verticalLineTo(21f)
                curveTo(2.75f, 21.14f, 2.86f, 21.25f, 3f, 21.25f)
                horizontalLineTo(16f)
                curveTo(19.58f, 21.25f, 21.25f, 19.58f, 21.25f, 16f)
                verticalLineTo(8f)
                curveTo(21.25f, 4.42f, 19.58f, 2.75f, 16f, 2.75f)
                horizontalLineTo(8f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(15.5f, 12.75f)
                horizontalLineTo(8.5f)
                curveTo(8.09f, 12.75f, 7.75f, 12.41f, 7.75f, 12f)
                curveTo(7.75f, 11.59f, 8.09f, 11.25f, 8.5f, 11.25f)
                horizontalLineTo(15.5f)
                curveTo(15.91f, 11.25f, 16.25f, 11.59f, 16.25f, 12f)
                curveTo(16.25f, 12.41f, 15.91f, 12.75f, 15.5f, 12.75f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(12f, 16.25f)
                curveTo(11.59f, 16.25f, 11.25f, 15.91f, 11.25f, 15.5f)
                verticalLineTo(8.5f)
                curveTo(11.25f, 8.09f, 11.59f, 7.75f, 12f, 7.75f)
                curveTo(12.41f, 7.75f, 12.75f, 8.09f, 12.75f, 8.5f)
                verticalLineTo(15.5f)
                curveTo(12.75f, 15.91f, 12.41f, 16.25f, 12f, 16.25f)
                close()
            }
        }.build()

        return _MessageAdd1!!
    }

@Suppress("ObjectPropertyName")
private var _MessageAdd1: ImageVector? = null
