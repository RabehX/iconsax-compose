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

val Iconsax.Outline.Archive2: ImageVector
    get() {
        if (_Archive2 != null) {
            return _Archive2!!
        }
        _Archive2 = ImageVector.Builder(
            name = "Outline.Archive2",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(16.5f, 22.75f)
                horizontalLineTo(7.5f)
                curveTo(4.2f, 22.75f, 3.75f, 20.95f, 3.75f, 19f)
                verticalLineTo(10.22f)
                curveTo(3.75f, 9.81f, 4.09f, 9.47f, 4.5f, 9.47f)
                curveTo(4.91f, 9.47f, 5.25f, 9.81f, 5.25f, 10.22f)
                verticalLineTo(19f)
                curveTo(5.25f, 20.74f, 5.55f, 21.25f, 7.5f, 21.25f)
                horizontalLineTo(16.5f)
                curveTo(18.45f, 21.25f, 18.75f, 20.74f, 18.75f, 19f)
                verticalLineTo(10.22f)
                curveTo(18.75f, 9.81f, 19.09f, 9.47f, 19.5f, 9.47f)
                curveTo(19.91f, 9.47f, 20.25f, 9.81f, 20.25f, 10.22f)
                verticalLineTo(19f)
                curveTo(20.25f, 20.95f, 19.8f, 22.75f, 16.5f, 22.75f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(19f, 10.75f)
                horizontalLineTo(5f)
                curveTo(2.58f, 10.75f, 1.25f, 9.42f, 1.25f, 7f)
                verticalLineTo(5f)
                curveTo(1.25f, 2.58f, 2.58f, 1.25f, 5f, 1.25f)
                horizontalLineTo(19f)
                curveTo(21.42f, 1.25f, 22.75f, 2.58f, 22.75f, 5f)
                verticalLineTo(7f)
                curveTo(22.75f, 9.42f, 21.42f, 10.75f, 19f, 10.75f)
                close()
                moveTo(5f, 2.75f)
                curveTo(3.42f, 2.75f, 2.75f, 3.42f, 2.75f, 5f)
                verticalLineTo(7f)
                curveTo(2.75f, 8.58f, 3.42f, 9.25f, 5f, 9.25f)
                horizontalLineTo(19f)
                curveTo(20.58f, 9.25f, 21.25f, 8.58f, 21.25f, 7f)
                verticalLineTo(5f)
                curveTo(21.25f, 3.42f, 20.58f, 2.75f, 19f, 2.75f)
                horizontalLineTo(5f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(13.82f, 14.75f)
                horizontalLineTo(10.18f)
                curveTo(9.77f, 14.75f, 9.43f, 14.41f, 9.43f, 14f)
                curveTo(9.43f, 13.59f, 9.77f, 13.25f, 10.18f, 13.25f)
                horizontalLineTo(13.82f)
                curveTo(14.23f, 13.25f, 14.57f, 13.59f, 14.57f, 14f)
                curveTo(14.57f, 14.41f, 14.23f, 14.75f, 13.82f, 14.75f)
                close()
            }
        }.build()

        return _Archive2!!
    }

@Suppress("ObjectPropertyName")
private var _Archive2: ImageVector? = null
