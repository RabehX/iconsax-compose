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

package io.github.rabehx.iconsax.filled


import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import io.github.rabehx.iconsax.Iconsax


val Iconsax.Filled.WatchStatus: ImageVector
    get() {
        if (_WatchStatus != null) {
            return _WatchStatus!!
        }
        _WatchStatus = ImageVector.Builder(
            name = "Filled.WatchStatus",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(16f, 3.75f)
                horizontalLineTo(8f)
                curveTo(7.59f, 3.75f, 7.25f, 3.41f, 7.25f, 3f)
                curveTo(7.25f, 2.59f, 7.59f, 2.25f, 8f, 2.25f)
                horizontalLineTo(16f)
                curveTo(16.41f, 2.25f, 16.75f, 2.59f, 16.75f, 3f)
                curveTo(16.75f, 3.41f, 16.41f, 3.75f, 16f, 3.75f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(16f, 21.75f)
                horizontalLineTo(8f)
                curveTo(7.59f, 21.75f, 7.25f, 21.41f, 7.25f, 21f)
                curveTo(7.25f, 20.59f, 7.59f, 20.25f, 8f, 20.25f)
                horizontalLineTo(16f)
                curveTo(16.41f, 20.25f, 16.75f, 20.59f, 16.75f, 21f)
                curveTo(16.75f, 21.41f, 16.41f, 21.75f, 16f, 21.75f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(15.5f, 5f)
                horizontalLineTo(8.5f)
                curveTo(6.17f, 5f, 5f, 6.17f, 5f, 8.5f)
                verticalLineTo(15.5f)
                curveTo(5f, 17.83f, 6.17f, 19f, 8.5f, 19f)
                horizontalLineTo(15.5f)
                curveTo(17.83f, 19f, 19f, 17.83f, 19f, 15.5f)
                verticalLineTo(8.5f)
                curveTo(19f, 6.17f, 17.83f, 5f, 15.5f, 5f)
                close()
                moveTo(9.75f, 14f)
                curveTo(9.75f, 14.41f, 9.41f, 14.75f, 9f, 14.75f)
                curveTo(8.59f, 14.75f, 8.25f, 14.42f, 8.25f, 14f)
                verticalLineTo(13f)
                curveTo(8.25f, 12.59f, 8.59f, 12.25f, 9f, 12.25f)
                curveTo(9.41f, 12.25f, 9.75f, 12.59f, 9.75f, 13f)
                verticalLineTo(14f)
                close()
                moveTo(12.75f, 14f)
                curveTo(12.75f, 14.41f, 12.41f, 14.75f, 12f, 14.75f)
                curveTo(11.59f, 14.75f, 11.25f, 14.41f, 11.25f, 14f)
                verticalLineTo(10f)
                curveTo(11.25f, 9.59f, 11.59f, 9.25f, 12f, 9.25f)
                curveTo(12.41f, 9.25f, 12.75f, 9.59f, 12.75f, 10f)
                verticalLineTo(14f)
                close()
                moveTo(15.75f, 14f)
                curveTo(15.75f, 14.41f, 15.41f, 14.75f, 15f, 14.75f)
                curveTo(14.59f, 14.75f, 14.25f, 14.41f, 14.25f, 14f)
                verticalLineTo(12f)
                curveTo(14.25f, 11.59f, 14.59f, 11.25f, 15f, 11.25f)
                curveTo(15.41f, 11.25f, 15.75f, 11.59f, 15.75f, 12f)
                verticalLineTo(14f)
                close()
            }
        }.build()

        return _WatchStatus!!
    }

@Suppress("ObjectPropertyName")
private var _WatchStatus: ImageVector? = null
