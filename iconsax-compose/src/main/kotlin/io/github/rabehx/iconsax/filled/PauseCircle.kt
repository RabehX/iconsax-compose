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


val Iconsax.Filled.PauseCircle: ImageVector
    get() {
        if (_PauseCircle != null) {
            return _PauseCircle!!
        }
        _PauseCircle = ImageVector.Builder(
            name = "Filled.PauseCircle",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(11.969f, 2f)
                curveTo(6.449f, 2f, 1.969f, 6.48f, 1.969f, 12f)
                curveTo(1.969f, 17.52f, 6.449f, 22f, 11.969f, 22f)
                curveTo(17.489f, 22f, 21.969f, 17.52f, 21.969f, 12f)
                curveTo(21.969f, 6.48f, 17.499f, 2f, 11.969f, 2f)
                close()
                moveTo(10.719f, 15.03f)
                curveTo(10.719f, 15.51f, 10.519f, 15.7f, 10.009f, 15.7f)
                horizontalLineTo(8.709f)
                curveTo(8.199f, 15.7f, 7.999f, 15.51f, 7.999f, 15.03f)
                verticalLineTo(8.97f)
                curveTo(7.999f, 8.49f, 8.199f, 8.3f, 8.709f, 8.3f)
                horizontalLineTo(9.999f)
                curveTo(10.509f, 8.3f, 10.709f, 8.49f, 10.709f, 8.97f)
                verticalLineTo(15.03f)
                horizontalLineTo(10.719f)
                close()
                moveTo(15.999f, 15.03f)
                curveTo(15.999f, 15.51f, 15.799f, 15.7f, 15.289f, 15.7f)
                horizontalLineTo(13.999f)
                curveTo(13.489f, 15.7f, 13.289f, 15.51f, 13.289f, 15.03f)
                verticalLineTo(8.97f)
                curveTo(13.289f, 8.49f, 13.489f, 8.3f, 13.999f, 8.3f)
                horizontalLineTo(15.289f)
                curveTo(15.799f, 8.3f, 15.999f, 8.49f, 15.999f, 8.97f)
                verticalLineTo(15.03f)
                close()
            }
        }.build()

        return _PauseCircle!!
    }

@Suppress("ObjectPropertyName")
private var _PauseCircle: ImageVector? = null
