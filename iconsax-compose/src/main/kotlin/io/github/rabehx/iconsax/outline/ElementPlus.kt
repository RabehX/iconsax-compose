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

val Iconsax.Outline.ElementPlus: ImageVector
    get() {
        if (_ElementPlus != null) {
            return _ElementPlus!!
        }
        _ElementPlus = ImageVector.Builder(
            name = "Outline.ElementPlus",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(19.77f, 11.25f)
                horizontalLineTo(15.73f)
                curveTo(13.72f, 11.25f, 12.75f, 10.27f, 12.75f, 8.27f)
                verticalLineTo(4.23f)
                curveTo(12.75f, 2.22f, 13.73f, 1.25f, 15.73f, 1.25f)
                horizontalLineTo(19.77f)
                curveTo(21.78f, 1.25f, 22.75f, 2.23f, 22.75f, 4.23f)
                verticalLineTo(8.27f)
                curveTo(22.75f, 10.27f, 21.77f, 11.25f, 19.77f, 11.25f)
                close()
                moveTo(15.73f, 2.75f)
                curveTo(14.55f, 2.75f, 14.25f, 3.05f, 14.25f, 4.23f)
                verticalLineTo(8.27f)
                curveTo(14.25f, 9.45f, 14.55f, 9.75f, 15.73f, 9.75f)
                horizontalLineTo(19.77f)
                curveTo(20.95f, 9.75f, 21.25f, 9.45f, 21.25f, 8.27f)
                verticalLineTo(4.23f)
                curveTo(21.25f, 3.05f, 20.95f, 2.75f, 19.77f, 2.75f)
                horizontalLineTo(15.73f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(8.27f, 11.25f)
                horizontalLineTo(4.23f)
                curveTo(2.22f, 11.25f, 1.25f, 10.36f, 1.25f, 8.52f)
                verticalLineTo(3.98f)
                curveTo(1.25f, 2.14f, 2.23f, 1.25f, 4.23f, 1.25f)
                horizontalLineTo(8.27f)
                curveTo(10.28f, 1.25f, 11.25f, 2.14f, 11.25f, 3.98f)
                verticalLineTo(8.51f)
                curveTo(11.25f, 10.36f, 10.27f, 11.25f, 8.27f, 11.25f)
                close()
                moveTo(4.23f, 2.75f)
                curveTo(2.89f, 2.75f, 2.75f, 3.13f, 2.75f, 3.98f)
                verticalLineTo(8.51f)
                curveTo(2.75f, 9.37f, 2.89f, 9.74f, 4.23f, 9.74f)
                horizontalLineTo(8.27f)
                curveTo(9.61f, 9.74f, 9.75f, 9.36f, 9.75f, 8.51f)
                verticalLineTo(3.98f)
                curveTo(9.75f, 3.12f, 9.61f, 2.75f, 8.27f, 2.75f)
                horizontalLineTo(4.23f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(8.27f, 22.75f)
                horizontalLineTo(4.23f)
                curveTo(2.22f, 22.75f, 1.25f, 21.77f, 1.25f, 19.77f)
                verticalLineTo(15.73f)
                curveTo(1.25f, 13.72f, 2.23f, 12.75f, 4.23f, 12.75f)
                horizontalLineTo(8.27f)
                curveTo(10.28f, 12.75f, 11.25f, 13.73f, 11.25f, 15.73f)
                verticalLineTo(19.77f)
                curveTo(11.25f, 21.77f, 10.27f, 22.75f, 8.27f, 22.75f)
                close()
                moveTo(4.23f, 14.25f)
                curveTo(3.05f, 14.25f, 2.75f, 14.55f, 2.75f, 15.73f)
                verticalLineTo(19.77f)
                curveTo(2.75f, 20.95f, 3.05f, 21.25f, 4.23f, 21.25f)
                horizontalLineTo(8.27f)
                curveTo(9.45f, 21.25f, 9.75f, 20.95f, 9.75f, 19.77f)
                verticalLineTo(15.73f)
                curveTo(9.75f, 14.55f, 9.45f, 14.25f, 8.27f, 14.25f)
                horizontalLineTo(4.23f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(20.5f, 18.25f)
                horizontalLineTo(14.5f)
                curveTo(14.09f, 18.25f, 13.75f, 17.91f, 13.75f, 17.5f)
                curveTo(13.75f, 17.09f, 14.09f, 16.75f, 14.5f, 16.75f)
                horizontalLineTo(20.5f)
                curveTo(20.91f, 16.75f, 21.25f, 17.09f, 21.25f, 17.5f)
                curveTo(21.25f, 17.91f, 20.91f, 18.25f, 20.5f, 18.25f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(17.5f, 21.25f)
                curveTo(17.09f, 21.25f, 16.75f, 20.91f, 16.75f, 20.5f)
                verticalLineTo(14.5f)
                curveTo(16.75f, 14.09f, 17.09f, 13.75f, 17.5f, 13.75f)
                curveTo(17.91f, 13.75f, 18.25f, 14.09f, 18.25f, 14.5f)
                verticalLineTo(20.5f)
                curveTo(18.25f, 20.91f, 17.91f, 21.25f, 17.5f, 21.25f)
                close()
            }
        }.build()

        return _ElementPlus!!
    }

@Suppress("ObjectPropertyName")
private var _ElementPlus: ImageVector? = null
