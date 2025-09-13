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


val Iconsax.Filled.Refresh2: ImageVector
    get() {
        if (_Refresh2 != null) {
            return _Refresh2!!
        }
        _Refresh2 = ImageVector.Builder(
            name = "Filled.Refresh2",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(16.19f, 2f)
                horizontalLineTo(7.81f)
                curveTo(4.17f, 2f, 2f, 4.17f, 2f, 7.81f)
                verticalLineTo(16.18f)
                curveTo(2f, 19.83f, 4.17f, 22f, 7.81f, 22f)
                horizontalLineTo(16.18f)
                curveTo(19.82f, 22f, 21.99f, 19.83f, 21.99f, 16.19f)
                verticalLineTo(7.81f)
                curveTo(22f, 4.17f, 19.83f, 2f, 16.19f, 2f)
                close()
                moveTo(12f, 18.25f)
                curveTo(10.21f, 18.25f, 8.81f, 17.36f, 7.86f, 16.48f)
                verticalLineTo(17.19f)
                curveTo(7.86f, 17.6f, 7.52f, 17.94f, 7.11f, 17.94f)
                curveTo(6.7f, 17.94f, 6.36f, 17.6f, 6.36f, 17.19f)
                verticalLineTo(14.44f)
                curveTo(6.36f, 14.03f, 6.7f, 13.69f, 7.11f, 13.69f)
                horizontalLineTo(9.59f)
                curveTo(10f, 13.69f, 10.34f, 14.03f, 10.34f, 14.44f)
                curveTo(10.34f, 14.85f, 10f, 15.19f, 9.59f, 15.19f)
                horizontalLineTo(8.69f)
                curveTo(9.43f, 15.93f, 10.58f, 16.75f, 12f, 16.75f)
                curveTo(14.62f, 16.75f, 16.75f, 14.62f, 16.75f, 12f)
                curveTo(16.75f, 11.59f, 17.09f, 11.25f, 17.5f, 11.25f)
                curveTo(17.91f, 11.25f, 18.25f, 11.59f, 18.25f, 12f)
                curveTo(18.25f, 15.45f, 15.45f, 18.25f, 12f, 18.25f)
                close()
                moveTo(18.25f, 9.54f)
                curveTo(18.25f, 9.57f, 18.25f, 9.6f, 18.25f, 9.62f)
                curveTo(18.24f, 9.73f, 18.21f, 9.83f, 18.16f, 9.92f)
                curveTo(18.11f, 10.01f, 18.04f, 10.09f, 17.95f, 10.16f)
                curveTo(17.88f, 10.21f, 17.8f, 10.25f, 17.71f, 10.28f)
                curveTo(17.64f, 10.3f, 17.57f, 10.31f, 17.5f, 10.31f)
                horizontalLineTo(15.07f)
                curveTo(14.66f, 10.31f, 14.32f, 9.97f, 14.32f, 9.56f)
                curveTo(14.32f, 9.15f, 14.66f, 8.81f, 15.07f, 8.81f)
                horizontalLineTo(15.9f)
                curveTo(15.1f, 8.07f, 13.81f, 7.25f, 12.02f, 7.25f)
                curveTo(9.4f, 7.25f, 7.27f, 9.38f, 7.27f, 12f)
                curveTo(7.27f, 12.41f, 6.93f, 12.75f, 6.52f, 12.75f)
                curveTo(6.11f, 12.75f, 5.75f, 12.41f, 5.75f, 12f)
                curveTo(5.75f, 8.55f, 8.55f, 5.75f, 12f, 5.75f)
                curveTo(14.15f, 5.75f, 15.73f, 6.68f, 16.75f, 7.57f)
                verticalLineTo(6.81f)
                curveTo(16.75f, 6.4f, 17.09f, 6.06f, 17.5f, 6.06f)
                curveTo(17.91f, 6.06f, 18.25f, 6.4f, 18.25f, 6.81f)
                verticalLineTo(9.54f)
                close()
            }
        }.build()

        return _Refresh2!!
    }

@Suppress("ObjectPropertyName")
private var _Refresh2: ImageVector? = null
