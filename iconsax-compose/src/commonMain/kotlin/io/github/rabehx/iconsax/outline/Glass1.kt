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

val Iconsax.Outline.Glass1: ImageVector
    get() {
        if (_Glass1 != null) {
            return _Glass1!!
        }
        _Glass1 = ImageVector.Builder(
            name = "Outline.Glass1",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(14f, 18.25f)
                horizontalLineTo(10f)
                curveTo(9.59f, 18.25f, 9.25f, 17.91f, 9.25f, 17.5f)
                curveTo(9.25f, 17.09f, 9.59f, 16.75f, 10f, 16.75f)
                horizontalLineTo(14f)
                curveTo(14.41f, 16.75f, 14.75f, 17.09f, 14.75f, 17.5f)
                curveTo(14.75f, 17.91f, 14.41f, 18.25f, 14f, 18.25f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(2f, 18.25f)
                curveTo(1.59f, 18.25f, 1.25f, 17.91f, 1.25f, 17.5f)
                verticalLineTo(7.5f)
                curveTo(1.25f, 3.09f, 2.59f, 1.75f, 7f, 1.75f)
                curveTo(7.41f, 1.75f, 7.75f, 2.09f, 7.75f, 2.5f)
                curveTo(7.75f, 2.91f, 7.41f, 3.25f, 7f, 3.25f)
                curveTo(3.43f, 3.25f, 2.75f, 3.92f, 2.75f, 7.5f)
                verticalLineTo(17.5f)
                curveTo(2.75f, 17.91f, 2.41f, 18.25f, 2f, 18.25f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(22f, 18.25f)
                curveTo(21.59f, 18.25f, 21.25f, 17.91f, 21.25f, 17.5f)
                verticalLineTo(7.5f)
                curveTo(21.25f, 3.92f, 20.57f, 3.25f, 17f, 3.25f)
                curveTo(16.59f, 3.25f, 16.25f, 2.91f, 16.25f, 2.5f)
                curveTo(16.25f, 2.09f, 16.59f, 1.75f, 17f, 1.75f)
                curveTo(21.41f, 1.75f, 22.75f, 3.09f, 22.75f, 7.5f)
                verticalLineTo(17.5f)
                curveTo(22.75f, 17.91f, 22.41f, 18.25f, 22f, 18.25f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(7.2f, 22.75f)
                horizontalLineTo(4.8f)
                curveTo(2.38f, 22.75f, 1.25f, 21.62f, 1.25f, 19.2f)
                verticalLineTo(15.91f)
                curveTo(1.25f, 13.49f, 2.38f, 12.36f, 4.8f, 12.36f)
                horizontalLineTo(7.2f)
                curveTo(9.62f, 12.36f, 10.75f, 13.49f, 10.75f, 15.91f)
                verticalLineTo(19.2f)
                curveTo(10.75f, 21.62f, 9.62f, 22.75f, 7.2f, 22.75f)
                close()
                moveTo(4.8f, 13.86f)
                curveTo(3.21f, 13.86f, 2.75f, 14.32f, 2.75f, 15.91f)
                verticalLineTo(19.2f)
                curveTo(2.75f, 20.79f, 3.21f, 21.25f, 4.8f, 21.25f)
                horizontalLineTo(7.2f)
                curveTo(8.79f, 21.25f, 9.25f, 20.79f, 9.25f, 19.2f)
                verticalLineTo(15.91f)
                curveTo(9.25f, 14.32f, 8.79f, 13.86f, 7.2f, 13.86f)
                horizontalLineTo(4.8f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(19.2f, 22.75f)
                horizontalLineTo(16.8f)
                curveTo(14.38f, 22.75f, 13.25f, 21.62f, 13.25f, 19.2f)
                verticalLineTo(15.91f)
                curveTo(13.25f, 13.49f, 14.38f, 12.36f, 16.8f, 12.36f)
                horizontalLineTo(19.2f)
                curveTo(21.62f, 12.36f, 22.75f, 13.49f, 22.75f, 15.91f)
                verticalLineTo(19.2f)
                curveTo(22.75f, 21.62f, 21.62f, 22.75f, 19.2f, 22.75f)
                close()
                moveTo(16.8f, 13.86f)
                curveTo(15.21f, 13.86f, 14.75f, 14.32f, 14.75f, 15.91f)
                verticalLineTo(19.2f)
                curveTo(14.75f, 20.79f, 15.21f, 21.25f, 16.8f, 21.25f)
                horizontalLineTo(19.2f)
                curveTo(20.79f, 21.25f, 21.25f, 20.79f, 21.25f, 19.2f)
                verticalLineTo(15.91f)
                curveTo(21.25f, 14.32f, 20.79f, 13.86f, 19.2f, 13.86f)
                horizontalLineTo(16.8f)
                close()
            }
        }.build()

        return _Glass1!!
    }

@Suppress("ObjectPropertyName")
private var _Glass1: ImageVector? = null
