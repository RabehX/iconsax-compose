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


val Iconsax.Filled.MoneyRecive: ImageVector
    get() {
        if (_MoneyRecive != null) {
            return _MoneyRecive!!
        }
        _MoneyRecive = ImageVector.Builder(
            name = "Filled.MoneyRecive",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(18.809f, 6.25f)
                horizontalLineTo(20.169f)
                curveTo(19.979f, 5.98f, 19.779f, 5.73f, 19.569f, 5.48f)
                lineTo(18.809f, 6.25f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(18.52f, 4.42f)
                curveTo(18.27f, 4.21f, 18.02f, 4.01f, 17.75f, 3.82f)
                verticalLineTo(5.18f)
                lineTo(18.52f, 4.42f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(19.58f, 5.481f)
                lineTo(22.529f, 2.531f)
                curveTo(22.819f, 2.241f, 22.819f, 1.761f, 22.529f, 1.471f)
                curveTo(22.24f, 1.181f, 21.76f, 1.181f, 21.469f, 1.471f)
                lineTo(18.52f, 4.421f)
                curveTo(18.899f, 4.751f, 19.25f, 5.111f, 19.58f, 5.481f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(17.752f, 3f)
                curveTo(17.752f, 2.59f, 17.412f, 2.25f, 17.002f, 2.25f)
                curveTo(16.602f, 2.25f, 16.282f, 2.57f, 16.262f, 2.96f)
                curveTo(16.782f, 3.21f, 17.282f, 3.49f, 17.752f, 3.82f)
                verticalLineTo(3f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(21.752f, 7f)
                curveTo(21.752f, 6.59f, 21.412f, 6.25f, 21.002f, 6.25f)
                horizontalLineTo(20.172f)
                curveTo(20.502f, 6.72f, 20.792f, 7.22f, 21.032f, 7.74f)
                curveTo(21.432f, 7.72f, 21.752f, 7.4f, 21.752f, 7f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(12.75f, 14.751f)
                horizontalLineTo(13.05f)
                curveTo(13.44f, 14.751f, 13.75f, 14.401f, 13.75f, 13.971f)
                curveTo(13.75f, 13.431f, 13.6f, 13.351f, 13.26f, 13.231f)
                lineTo(12.75f, 13.051f)
                verticalLineTo(14.751f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(21.04f, 7.74f)
                curveTo(21.03f, 7.74f, 21.02f, 7.75f, 21f, 7.75f)
                horizontalLineTo(17f)
                curveTo(16.9f, 7.75f, 16.81f, 7.73f, 16.71f, 7.69f)
                curveTo(16.53f, 7.61f, 16.38f, 7.47f, 16.3f, 7.28f)
                curveTo(16.27f, 7.19f, 16.25f, 7.1f, 16.25f, 7f)
                verticalLineTo(3f)
                curveTo(16.25f, 2.99f, 16.26f, 2.98f, 16.26f, 2.96f)
                curveTo(14.96f, 2.35f, 13.52f, 2f, 12f, 2f)
                curveTo(6.48f, 2f, 2f, 6.48f, 2f, 12f)
                curveTo(2f, 17.52f, 6.48f, 22f, 12f, 22f)
                curveTo(17.52f, 22f, 22f, 17.52f, 22f, 12f)
                curveTo(22f, 10.48f, 21.65f, 9.04f, 21.04f, 7.74f)
                close()
                moveTo(13.75f, 11.82f)
                curveTo(14.39f, 12.04f, 15.25f, 12.51f, 15.25f, 13.98f)
                curveTo(15.25f, 15.23f, 14.26f, 16.26f, 13.05f, 16.26f)
                horizontalLineTo(12.75f)
                verticalLineTo(16.51f)
                curveTo(12.75f, 16.92f, 12.41f, 17.26f, 12f, 17.26f)
                curveTo(11.59f, 17.26f, 11.25f, 16.92f, 11.25f, 16.51f)
                verticalLineTo(16.26f)
                horizontalLineTo(11.17f)
                curveTo(9.84f, 16.26f, 8.75f, 15.14f, 8.75f, 13.76f)
                curveTo(8.75f, 13.34f, 9.09f, 13f, 9.5f, 13f)
                curveTo(9.91f, 13f, 10.25f, 13.34f, 10.25f, 13.75f)
                curveTo(10.25f, 14.3f, 10.66f, 14.75f, 11.17f, 14.75f)
                horizontalLineTo(11.25f)
                verticalLineTo(12.53f)
                lineTo(10.25f, 12.18f)
                curveTo(9.61f, 11.96f, 8.75f, 11.49f, 8.75f, 10.02f)
                curveTo(8.75f, 8.77f, 9.74f, 7.74f, 10.95f, 7.74f)
                horizontalLineTo(11.25f)
                verticalLineTo(7.5f)
                curveTo(11.25f, 7.09f, 11.59f, 6.75f, 12f, 6.75f)
                curveTo(12.41f, 6.75f, 12.75f, 7.09f, 12.75f, 7.5f)
                verticalLineTo(7.75f)
                horizontalLineTo(12.83f)
                curveTo(14.16f, 7.75f, 15.25f, 8.87f, 15.25f, 10.25f)
                curveTo(15.25f, 10.66f, 14.91f, 11f, 14.5f, 11f)
                curveTo(14.09f, 11f, 13.75f, 10.66f, 13.75f, 10.25f)
                curveTo(13.75f, 9.7f, 13.34f, 9.25f, 12.83f, 9.25f)
                horizontalLineTo(12.75f)
                verticalLineTo(11.47f)
                lineTo(13.75f, 11.82f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(10.25f, 10.03f)
                curveTo(10.25f, 10.57f, 10.4f, 10.65f, 10.74f, 10.77f)
                lineTo(11.25f, 10.95f)
                verticalLineTo(9.25f)
                horizontalLineTo(10.95f)
                curveTo(10.57f, 9.25f, 10.25f, 9.6f, 10.25f, 10.03f)
                close()
            }
        }.build()

        return _MoneyRecive!!
    }

@Suppress("ObjectPropertyName")
private var _MoneyRecive: ImageVector? = null
