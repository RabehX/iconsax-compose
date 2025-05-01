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


val Iconsax.Filled.RefreshCircle: ImageVector
    get() {
        if (_RefreshCircle != null) {
            return _RefreshCircle!!
        }
        _RefreshCircle = ImageVector.Builder(
            name = "Filled.RefreshCircle",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(12f, 2f)
                curveTo(6.48f, 2f, 2f, 6.48f, 2f, 12f)
                curveTo(2f, 17.52f, 6.48f, 22f, 12f, 22f)
                curveTo(17.52f, 22f, 22f, 17.52f, 22f, 12f)
                curveTo(22f, 6.48f, 17.52f, 2f, 12f, 2f)
                close()
                moveTo(6.6f, 11.23f)
                curveTo(6.77f, 10.04f, 7.3f, 8.97f, 8.13f, 8.13f)
                curveTo(10.13f, 6.14f, 13.28f, 6.03f, 15.42f, 7.77f)
                verticalLineTo(6.82f)
                curveTo(15.42f, 6.41f, 15.76f, 6.07f, 16.17f, 6.07f)
                curveTo(16.58f, 6.07f, 16.92f, 6.41f, 16.92f, 6.82f)
                verticalLineTo(9.49f)
                curveTo(16.92f, 9.9f, 16.58f, 10.24f, 16.17f, 10.24f)
                horizontalLineTo(13.5f)
                curveTo(13.09f, 10.24f, 12.75f, 9.9f, 12.75f, 9.49f)
                curveTo(12.75f, 9.08f, 13.09f, 8.74f, 13.5f, 8.74f)
                horizontalLineTo(14.25f)
                curveTo(12.7f, 7.66f, 10.56f, 7.81f, 9.18f, 9.19f)
                curveTo(8.58f, 9.79f, 8.2f, 10.57f, 8.07f, 11.44f)
                curveTo(8.02f, 11.81f, 7.7f, 12.08f, 7.33f, 12.08f)
                curveTo(7.29f, 12.08f, 7.26f, 12.08f, 7.22f, 12.07f)
                curveTo(6.83f, 12.02f, 6.54f, 11.64f, 6.6f, 11.23f)
                close()
                moveTo(15.87f, 15.87f)
                curveTo(14.8f, 16.94f, 13.4f, 17.47f, 12f, 17.47f)
                curveTo(10.78f, 17.47f, 9.57f, 17.04f, 8.57f, 16.23f)
                verticalLineTo(17.17f)
                curveTo(8.57f, 17.58f, 8.23f, 17.92f, 7.82f, 17.92f)
                curveTo(7.41f, 17.92f, 7.07f, 17.58f, 7.07f, 17.17f)
                verticalLineTo(14.5f)
                curveTo(7.07f, 14.09f, 7.41f, 13.75f, 7.82f, 13.75f)
                horizontalLineTo(10.49f)
                curveTo(10.9f, 13.75f, 11.24f, 14.09f, 11.24f, 14.5f)
                curveTo(11.24f, 14.91f, 10.9f, 15.25f, 10.49f, 15.25f)
                horizontalLineTo(9.74f)
                curveTo(11.29f, 16.33f, 13.43f, 16.18f, 14.81f, 14.8f)
                curveTo(15.41f, 14.2f, 15.79f, 13.42f, 15.92f, 12.55f)
                curveTo(15.98f, 12.14f, 16.35f, 11.85f, 16.77f, 11.91f)
                curveTo(17.18f, 11.97f, 17.46f, 12.35f, 17.41f, 12.76f)
                curveTo(17.23f, 13.97f, 16.7f, 15.04f, 15.87f, 15.87f)
                close()
            }
        }.build()

        return _RefreshCircle!!
    }

@Suppress("ObjectPropertyName")
private var _RefreshCircle: ImageVector? = null
