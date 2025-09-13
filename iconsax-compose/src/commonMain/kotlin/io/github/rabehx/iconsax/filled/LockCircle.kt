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


val Iconsax.Filled.LockCircle: ImageVector
    get() {
        if (_LockCircle != null) {
            return _LockCircle!!
        }
        _LockCircle = ImageVector.Builder(
            name = "Filled.LockCircle",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(12f, 7.75f)
                curveTo(10.11f, 7.75f, 9.75f, 8.54f, 9.75f, 10f)
                verticalLineTo(10.62f)
                horizontalLineTo(14.25f)
                verticalLineTo(10f)
                curveTo(14.25f, 8.54f, 13.89f, 7.75f, 12f, 7.75f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(11.998f, 15.098f)
                curveTo(12.606f, 15.098f, 13.098f, 14.606f, 13.098f, 13.998f)
                curveTo(13.098f, 13.391f, 12.606f, 12.898f, 11.998f, 12.898f)
                curveTo(11.391f, 12.898f, 10.898f, 13.391f, 10.898f, 13.998f)
                curveTo(10.898f, 14.606f, 11.391f, 15.098f, 11.998f, 15.098f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(12f, 2f)
                curveTo(6.48f, 2f, 2f, 6.48f, 2f, 12f)
                curveTo(2f, 17.52f, 6.48f, 22f, 12f, 22f)
                curveTo(17.52f, 22f, 22f, 17.52f, 22f, 12f)
                curveTo(22f, 6.48f, 17.52f, 2f, 12f, 2f)
                close()
                moveTo(17.38f, 14.5f)
                curveTo(17.38f, 16.7f, 16.7f, 17.38f, 14.5f, 17.38f)
                horizontalLineTo(9.5f)
                curveTo(7.3f, 17.38f, 6.62f, 16.7f, 6.62f, 14.5f)
                verticalLineTo(13.5f)
                curveTo(6.62f, 11.79f, 7.03f, 11f, 8.25f, 10.73f)
                verticalLineTo(10f)
                curveTo(8.25f, 9.07f, 8.25f, 6.25f, 12f, 6.25f)
                curveTo(15.75f, 6.25f, 15.75f, 9.07f, 15.75f, 10f)
                verticalLineTo(10.73f)
                curveTo(16.97f, 11f, 17.38f, 11.79f, 17.38f, 13.5f)
                verticalLineTo(14.5f)
                close()
            }
        }.build()

        return _LockCircle!!
    }

@Suppress("ObjectPropertyName")
private var _LockCircle: ImageVector? = null
