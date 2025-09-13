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

val Iconsax.Outline.Category: ImageVector
    get() {
        if (_Category != null) {
            return _Category!!
        }
        _Category = ImageVector.Builder(
            name = "Outline.Category",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(7f, 10.75f)
                horizontalLineTo(5f)
                curveTo(2.58f, 10.75f, 1.25f, 9.42f, 1.25f, 7f)
                verticalLineTo(5f)
                curveTo(1.25f, 2.58f, 2.58f, 1.25f, 5f, 1.25f)
                horizontalLineTo(7f)
                curveTo(9.42f, 1.25f, 10.75f, 2.58f, 10.75f, 5f)
                verticalLineTo(7f)
                curveTo(10.75f, 9.42f, 9.42f, 10.75f, 7f, 10.75f)
                close()
                moveTo(5f, 2.75f)
                curveTo(3.42f, 2.75f, 2.75f, 3.42f, 2.75f, 5f)
                verticalLineTo(7f)
                curveTo(2.75f, 8.58f, 3.42f, 9.25f, 5f, 9.25f)
                horizontalLineTo(7f)
                curveTo(8.58f, 9.25f, 9.25f, 8.58f, 9.25f, 7f)
                verticalLineTo(5f)
                curveTo(9.25f, 3.42f, 8.58f, 2.75f, 7f, 2.75f)
                horizontalLineTo(5f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(19f, 10.75f)
                horizontalLineTo(17f)
                curveTo(14.58f, 10.75f, 13.25f, 9.42f, 13.25f, 7f)
                verticalLineTo(5f)
                curveTo(13.25f, 2.58f, 14.58f, 1.25f, 17f, 1.25f)
                horizontalLineTo(19f)
                curveTo(21.42f, 1.25f, 22.75f, 2.58f, 22.75f, 5f)
                verticalLineTo(7f)
                curveTo(22.75f, 9.42f, 21.42f, 10.75f, 19f, 10.75f)
                close()
                moveTo(17f, 2.75f)
                curveTo(15.42f, 2.75f, 14.75f, 3.42f, 14.75f, 5f)
                verticalLineTo(7f)
                curveTo(14.75f, 8.58f, 15.42f, 9.25f, 17f, 9.25f)
                horizontalLineTo(19f)
                curveTo(20.58f, 9.25f, 21.25f, 8.58f, 21.25f, 7f)
                verticalLineTo(5f)
                curveTo(21.25f, 3.42f, 20.58f, 2.75f, 19f, 2.75f)
                horizontalLineTo(17f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(19f, 22.75f)
                horizontalLineTo(17f)
                curveTo(14.58f, 22.75f, 13.25f, 21.42f, 13.25f, 19f)
                verticalLineTo(17f)
                curveTo(13.25f, 14.58f, 14.58f, 13.25f, 17f, 13.25f)
                horizontalLineTo(19f)
                curveTo(21.42f, 13.25f, 22.75f, 14.58f, 22.75f, 17f)
                verticalLineTo(19f)
                curveTo(22.75f, 21.42f, 21.42f, 22.75f, 19f, 22.75f)
                close()
                moveTo(17f, 14.75f)
                curveTo(15.42f, 14.75f, 14.75f, 15.42f, 14.75f, 17f)
                verticalLineTo(19f)
                curveTo(14.75f, 20.58f, 15.42f, 21.25f, 17f, 21.25f)
                horizontalLineTo(19f)
                curveTo(20.58f, 21.25f, 21.25f, 20.58f, 21.25f, 19f)
                verticalLineTo(17f)
                curveTo(21.25f, 15.42f, 20.58f, 14.75f, 19f, 14.75f)
                horizontalLineTo(17f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(7f, 22.75f)
                horizontalLineTo(5f)
                curveTo(2.58f, 22.75f, 1.25f, 21.42f, 1.25f, 19f)
                verticalLineTo(17f)
                curveTo(1.25f, 14.58f, 2.58f, 13.25f, 5f, 13.25f)
                horizontalLineTo(7f)
                curveTo(9.42f, 13.25f, 10.75f, 14.58f, 10.75f, 17f)
                verticalLineTo(19f)
                curveTo(10.75f, 21.42f, 9.42f, 22.75f, 7f, 22.75f)
                close()
                moveTo(5f, 14.75f)
                curveTo(3.42f, 14.75f, 2.75f, 15.42f, 2.75f, 17f)
                verticalLineTo(19f)
                curveTo(2.75f, 20.58f, 3.42f, 21.25f, 5f, 21.25f)
                horizontalLineTo(7f)
                curveTo(8.58f, 21.25f, 9.25f, 20.58f, 9.25f, 19f)
                verticalLineTo(17f)
                curveTo(9.25f, 15.42f, 8.58f, 14.75f, 7f, 14.75f)
                horizontalLineTo(5f)
                close()
            }
        }.build()

        return _Category!!
    }

@Suppress("ObjectPropertyName")
private var _Category: ImageVector? = null
