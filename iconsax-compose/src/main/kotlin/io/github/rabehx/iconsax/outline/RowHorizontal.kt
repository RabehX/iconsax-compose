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

val Iconsax.Outline.RowHorizontal: ImageVector
    get() {
        if (_RowHorizontal != null) {
            return _RowHorizontal!!
        }
        _RowHorizontal = ImageVector.Builder(
            name = "Outline.RowHorizontal",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(8.27f, 22.75f)
                horizontalLineTo(4.23f)
                curveTo(2.22f, 22.75f, 1.25f, 21.82f, 1.25f, 19.9f)
                verticalLineTo(4.1f)
                curveTo(1.25f, 2.18f, 2.23f, 1.25f, 4.23f, 1.25f)
                horizontalLineTo(8.27f)
                curveTo(10.28f, 1.25f, 11.25f, 2.18f, 11.25f, 4.1f)
                verticalLineTo(19.9f)
                curveTo(11.25f, 21.82f, 10.27f, 22.75f, 8.27f, 22.75f)
                close()
                moveTo(4.23f, 2.75f)
                curveTo(2.96f, 2.75f, 2.75f, 3.09f, 2.75f, 4.1f)
                verticalLineTo(19.9f)
                curveTo(2.75f, 20.91f, 2.96f, 21.25f, 4.23f, 21.25f)
                horizontalLineTo(8.27f)
                curveTo(9.54f, 21.25f, 9.75f, 20.91f, 9.75f, 19.9f)
                verticalLineTo(4.1f)
                curveTo(9.75f, 3.09f, 9.54f, 2.75f, 8.27f, 2.75f)
                horizontalLineTo(4.23f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(19.77f, 22.75f)
                horizontalLineTo(15.73f)
                curveTo(13.72f, 22.75f, 12.75f, 21.82f, 12.75f, 19.9f)
                verticalLineTo(4.1f)
                curveTo(12.75f, 2.18f, 13.73f, 1.25f, 15.73f, 1.25f)
                horizontalLineTo(19.77f)
                curveTo(21.78f, 1.25f, 22.75f, 2.18f, 22.75f, 4.1f)
                verticalLineTo(19.9f)
                curveTo(22.75f, 21.82f, 21.77f, 22.75f, 19.77f, 22.75f)
                close()
                moveTo(15.73f, 2.75f)
                curveTo(14.46f, 2.75f, 14.25f, 3.09f, 14.25f, 4.1f)
                verticalLineTo(19.9f)
                curveTo(14.25f, 20.91f, 14.46f, 21.25f, 15.73f, 21.25f)
                horizontalLineTo(19.77f)
                curveTo(21.04f, 21.25f, 21.25f, 20.91f, 21.25f, 19.9f)
                verticalLineTo(4.1f)
                curveTo(21.25f, 3.09f, 21.04f, 2.75f, 19.77f, 2.75f)
                horizontalLineTo(15.73f)
                close()
            }
        }.build()

        return _RowHorizontal!!
    }

@Suppress("ObjectPropertyName")
private var _RowHorizontal: ImageVector? = null
