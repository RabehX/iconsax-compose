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


val Iconsax.Filled.Buildings: ImageVector
    get() {
        if (_Buildings != null) {
            return _Buildings!!
        }
        _Buildings = ImageVector.Builder(
            name = "Filled.Buildings",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(5f, 8f)
                curveTo(3.34f, 8f, 2f, 9.34f, 2f, 11f)
                verticalLineTo(19f)
                curveTo(2f, 20.66f, 3.34f, 22f, 5f, 22f)
                horizontalLineTo(6.5f)
                curveTo(7.6f, 22f, 8.5f, 21.1f, 8.5f, 20f)
                verticalLineTo(10f)
                curveTo(8.5f, 8.9f, 7.6f, 8f, 6.5f, 8f)
                horizontalLineTo(5f)
                close()
                moveTo(6f, 17f)
                curveTo(6f, 17.41f, 5.66f, 17.75f, 5.25f, 17.75f)
                curveTo(4.84f, 17.75f, 4.5f, 17.41f, 4.5f, 17f)
                verticalLineTo(13f)
                curveTo(4.5f, 12.59f, 4.84f, 12.25f, 5.25f, 12.25f)
                curveTo(5.66f, 12.25f, 6f, 12.59f, 6f, 13f)
                verticalLineTo(17f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(19f, 2f)
                horizontalLineTo(13f)
                curveTo(11.34f, 2f, 10f, 3.34f, 10f, 5f)
                verticalLineTo(19f)
                curveTo(10f, 20.66f, 11.34f, 22f, 13f, 22f)
                horizontalLineTo(13.5f)
                curveTo(13.78f, 22f, 14f, 21.78f, 14f, 21.5f)
                verticalLineTo(18f)
                curveTo(14f, 17.45f, 14.45f, 17f, 15f, 17f)
                horizontalLineTo(17f)
                curveTo(17.55f, 17f, 18f, 17.45f, 18f, 18f)
                verticalLineTo(21.5f)
                curveTo(18f, 21.78f, 18.22f, 22f, 18.5f, 22f)
                horizontalLineTo(19f)
                curveTo(20.66f, 22f, 22f, 20.66f, 22f, 19f)
                verticalLineTo(5f)
                curveTo(22f, 3.34f, 20.66f, 2f, 19f, 2f)
                close()
                moveTo(14.75f, 13f)
                curveTo(14.75f, 13.41f, 14.41f, 13.75f, 14f, 13.75f)
                curveTo(13.59f, 13.75f, 13.25f, 13.41f, 13.25f, 13f)
                verticalLineTo(8f)
                curveTo(13.25f, 7.59f, 13.59f, 7.25f, 14f, 7.25f)
                curveTo(14.41f, 7.25f, 14.75f, 7.59f, 14.75f, 8f)
                verticalLineTo(13f)
                close()
                moveTo(18.75f, 13f)
                curveTo(18.75f, 13.41f, 18.41f, 13.75f, 18f, 13.75f)
                curveTo(17.59f, 13.75f, 17.25f, 13.41f, 17.25f, 13f)
                verticalLineTo(8f)
                curveTo(17.25f, 7.59f, 17.59f, 7.25f, 18f, 7.25f)
                curveTo(18.41f, 7.25f, 18.75f, 7.59f, 18.75f, 8f)
                verticalLineTo(13f)
                close()
            }
        }.build()

        return _Buildings!!
    }

@Suppress("ObjectPropertyName")
private var _Buildings: ImageVector? = null
