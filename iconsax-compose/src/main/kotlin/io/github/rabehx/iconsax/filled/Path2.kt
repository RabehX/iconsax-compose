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


val Iconsax.Filled.Path2: ImageVector
    get() {
        if (_Path2 != null) {
            return _Path2!!
        }
        _Path2 = ImageVector.Builder(
            name = "Filled.Path2",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(14.151f, 22f)
                horizontalLineTo(9.83f)
                curveTo(8.29f, 22f, 7.15f, 20.75f, 7.45f, 19.42f)
                lineTo(7.97f, 17.1f)
                curveTo(8.07f, 16.64f, 8.48f, 16.32f, 8.95f, 16.32f)
                horizontalLineTo(15.04f)
                curveTo(15.51f, 16.32f, 15.91f, 16.64f, 16.021f, 17.1f)
                lineTo(16.541f, 19.41f)
                curveTo(16.861f, 20.84f, 15.79f, 22f, 14.151f, 22f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(18.82f, 13.69f)
                lineTo(17.75f, 14.63f)
                curveTo(17.38f, 14.95f, 16.91f, 15.13f, 16.43f, 15.13f)
                horizontalLineTo(7.59f)
                curveTo(7.1f, 15.13f, 6.62f, 14.95f, 6.26f, 14.62f)
                lineTo(5.21f, 13.68f)
                curveTo(3.49f, 12.27f, 3.48f, 11.19f, 4.8f, 9.53f)
                lineTo(10.03f, 2.92f)
                curveTo(10.066f, 2.871f, 10.104f, 2.824f, 10.142f, 2.778f)
                curveTo(10.583f, 2.257f, 11.27f, 2.705f, 11.27f, 3.387f)
                verticalLineTo(6.86f)
                curveTo(11.26f, 7.29f, 11.6f, 7.63f, 12.02f, 7.62f)
                curveTo(12.44f, 7.63f, 12.77f, 7.29f, 12.78f, 6.86f)
                verticalLineTo(3.387f)
                curveTo(12.78f, 2.705f, 13.456f, 2.268f, 13.909f, 2.778f)
                curveTo(13.946f, 2.821f, 13.983f, 2.865f, 14.02f, 2.91f)
                lineTo(19.23f, 9.53f)
                curveTo(20.53f, 11.19f, 20.48f, 12.22f, 18.82f, 13.69f)
                close()
            }
        }.build()

        return _Path2!!
    }

@Suppress("ObjectPropertyName")
private var _Path2: ImageVector? = null
