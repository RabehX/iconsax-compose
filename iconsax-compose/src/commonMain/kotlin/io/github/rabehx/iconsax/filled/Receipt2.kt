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


val Iconsax.Filled.Receipt2: ImageVector
    get() {
        if (_Receipt2 != null) {
            return _Receipt2!!
        }
        _Receipt2 = ImageVector.Builder(
            name = "Filled.Receipt2",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(19.5f, 3.67f)
                curveTo(19.5f, 3.66f, 19.5f, 3.65f, 19.48f, 3.64f)
                curveTo(19.26f, 3.36f, 18.97f, 3.21f, 18.63f, 3.21f)
                curveTo(18.1f, 3.21f, 17.46f, 3.56f, 16.77f, 4.3f)
                curveTo(15.95f, 5.18f, 14.69f, 5.11f, 13.97f, 4.15f)
                lineTo(12.96f, 2.81f)
                curveTo(12.56f, 2.27f, 12.03f, 2f, 11.5f, 2f)
                curveTo(10.97f, 2f, 10.44f, 2.27f, 10.04f, 2.81f)
                lineTo(9.02f, 4.16f)
                curveTo(8.31f, 5.11f, 7.06f, 5.18f, 6.24f, 4.31f)
                lineTo(6.23f, 4.3f)
                curveTo(5.1f, 3.09f, 4.09f, 2.91f, 3.52f, 3.64f)
                curveTo(3.5f, 3.65f, 3.5f, 3.66f, 3.5f, 3.67f)
                curveTo(3.14f, 4.44f, 3f, 5.52f, 3f, 7.04f)
                verticalLineTo(16.96f)
                curveTo(3f, 18.48f, 3.14f, 19.56f, 3.5f, 20.33f)
                curveTo(3.5f, 20.34f, 3.51f, 20.36f, 3.52f, 20.37f)
                curveTo(4.1f, 21.09f, 5.1f, 20.91f, 6.23f, 19.7f)
                lineTo(6.24f, 19.69f)
                curveTo(7.06f, 18.82f, 8.31f, 18.89f, 9.02f, 19.84f)
                lineTo(10.04f, 21.19f)
                curveTo(10.44f, 21.73f, 10.97f, 22f, 11.5f, 22f)
                curveTo(12.03f, 22f, 12.56f, 21.73f, 12.96f, 21.19f)
                lineTo(13.97f, 19.85f)
                curveTo(14.69f, 18.89f, 15.95f, 18.82f, 16.77f, 19.7f)
                curveTo(17.46f, 20.44f, 18.1f, 20.79f, 18.63f, 20.79f)
                curveTo(18.97f, 20.79f, 19.26f, 20.65f, 19.48f, 20.37f)
                curveTo(19.49f, 20.36f, 19.5f, 20.34f, 19.5f, 20.33f)
                curveTo(19.86f, 19.56f, 20f, 18.48f, 20f, 16.96f)
                verticalLineTo(7.04f)
                curveTo(20f, 5.52f, 19.86f, 4.44f, 19.5f, 3.67f)
                close()
                moveTo(14f, 14.5f)
                horizontalLineTo(8f)
                curveTo(7.59f, 14.5f, 7.25f, 14.16f, 7.25f, 13.75f)
                curveTo(7.25f, 13.34f, 7.59f, 13f, 8f, 13f)
                horizontalLineTo(14f)
                curveTo(14.41f, 13f, 14.75f, 13.34f, 14.75f, 13.75f)
                curveTo(14.75f, 14.16f, 14.41f, 14.5f, 14f, 14.5f)
                close()
                moveTo(16f, 11f)
                horizontalLineTo(8f)
                curveTo(7.59f, 11f, 7.25f, 10.66f, 7.25f, 10.25f)
                curveTo(7.25f, 9.84f, 7.59f, 9.5f, 8f, 9.5f)
                horizontalLineTo(16f)
                curveTo(16.41f, 9.5f, 16.75f, 9.84f, 16.75f, 10.25f)
                curveTo(16.75f, 10.66f, 16.41f, 11f, 16f, 11f)
                close()
            }
        }.build()

        return _Receipt2!!
    }

@Suppress("ObjectPropertyName")
private var _Receipt2: ImageVector? = null
