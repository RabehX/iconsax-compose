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

val Iconsax.Outline.PauseCircle: ImageVector
    get() {
        if (_PauseCircle != null) {
            return _PauseCircle!!
        }
        _PauseCircle = ImageVector.Builder(
            name = "Outline.PauseCircle",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(11.971f, 22.75f)
                curveTo(6.051f, 22.75f, 1.221f, 17.93f, 1.221f, 12f)
                curveTo(1.221f, 6.07f, 6.051f, 1.25f, 11.971f, 1.25f)
                curveTo(17.891f, 1.25f, 22.721f, 6.07f, 22.721f, 12f)
                curveTo(22.721f, 17.93f, 17.901f, 22.75f, 11.971f, 22.75f)
                close()
                moveTo(11.971f, 2.75f)
                curveTo(6.871f, 2.75f, 2.721f, 6.9f, 2.721f, 12f)
                curveTo(2.721f, 17.1f, 6.871f, 21.25f, 11.971f, 21.25f)
                curveTo(17.071f, 21.25f, 21.221f, 17.1f, 21.221f, 12f)
                curveTo(21.221f, 6.9f, 17.071f, 2.75f, 11.971f, 2.75f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(10.01f, 15.95f)
                horizontalLineTo(8.71f)
                curveTo(7.79f, 15.95f, 7.25f, 15.42f, 7.25f, 14.53f)
                verticalLineTo(9.47f)
                curveTo(7.25f, 8.58f, 7.8f, 8.05f, 8.71f, 8.05f)
                horizontalLineTo(10f)
                curveTo(10.92f, 8.05f, 11.46f, 8.58f, 11.46f, 9.47f)
                verticalLineTo(14.53f)
                curveTo(11.47f, 15.42f, 10.92f, 15.95f, 10.01f, 15.95f)
                close()
                moveTo(8.75f, 14.45f)
                horizontalLineTo(9.97f)
                verticalLineTo(9.55f)
                horizontalLineTo(8.76f)
                lineTo(8.75f, 14.45f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(15.289f, 15.95f)
                horizontalLineTo(13.999f)
                curveTo(13.079f, 15.95f, 12.539f, 15.42f, 12.539f, 14.53f)
                verticalLineTo(9.47f)
                curveTo(12.539f, 8.58f, 13.089f, 8.05f, 13.999f, 8.05f)
                horizontalLineTo(15.289f)
                curveTo(16.209f, 8.05f, 16.749f, 8.58f, 16.749f, 9.47f)
                verticalLineTo(14.53f)
                curveTo(16.749f, 15.42f, 16.199f, 15.95f, 15.289f, 15.95f)
                close()
                moveTo(14.029f, 14.45f)
                horizontalLineTo(15.249f)
                verticalLineTo(9.55f)
                horizontalLineTo(14.039f)
                lineTo(14.029f, 14.45f)
                close()
            }
        }.build()

        return _PauseCircle!!
    }

@Suppress("ObjectPropertyName")
private var _PauseCircle: ImageVector? = null
